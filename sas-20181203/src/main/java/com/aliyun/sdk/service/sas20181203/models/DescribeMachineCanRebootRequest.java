// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMachineCanRebootRequest} extends {@link RequestModel}
 *
 * <p>DescribeMachineCanRebootRequest</p>
 */
public class DescribeMachineCanRebootRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private DescribeMachineCanRebootRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMachineCanRebootRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeMachineCanRebootRequest, Builder> {
        private String type; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMachineCanRebootRequest request) {
            super(request);
            this.type = request.type;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The type of the vulnerabilities. Valid values:</p>
         * <ul>
         * <li>cve: Linux software vulnerabilities</li>
         * <li>sys: Windows system vulnerabilities</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sys</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>5b268326-273e-44fc-a0e3-9482435c****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeMachineCanRebootRequest build() {
            return new DescribeMachineCanRebootRequest(this);
        } 

    } 

}
