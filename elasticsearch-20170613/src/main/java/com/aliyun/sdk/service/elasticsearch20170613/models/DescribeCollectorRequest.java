// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCollectorRequest} extends {@link RequestModel}
 *
 * <p>DescribeCollectorRequest</p>
 */
public class DescribeCollectorRequest extends Request {
    @Path
    @NameInMap("ResId")
    @Validation(required = true)
    private String resId;

    @Body
    @NameInMap("body")
    private String body;

    private DescribeCollectorRequest(Builder builder) {
        super(builder);
        this.resId = builder.resId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCollectorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resId
     */
    public String getResId() {
        return this.resId;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<DescribeCollectorRequest, Builder> {
        private String resId; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCollectorRequest request) {
            super(request);
            this.resId = request.resId;
            this.body = request.body;
        } 

        /**
         * ResId.
         */
        public Builder resId(String resId) {
            this.putPathParameter("ResId", resId);
            this.resId = resId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public DescribeCollectorRequest build() {
            return new DescribeCollectorRequest(this);
        } 

    } 

}
