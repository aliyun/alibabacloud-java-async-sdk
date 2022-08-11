// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtIpFlowControlRequest} extends {@link RequestModel}
 *
 * <p>FtIpFlowControlRequest</p>
 */
public class FtIpFlowControlRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    private FtIpFlowControlRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FtIpFlowControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<FtIpFlowControlRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(FtIpFlowControlRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public FtIpFlowControlRequest build() {
            return new FtIpFlowControlRequest(this);
        } 

    } 

}
