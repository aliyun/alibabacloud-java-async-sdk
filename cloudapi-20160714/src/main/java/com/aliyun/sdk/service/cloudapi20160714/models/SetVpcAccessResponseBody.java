// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link SetVpcAccessResponseBody} extends {@link TeaModel}
 *
 * <p>SetVpcAccessResponseBody</p>
 */
public class SetVpcAccessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpcAccessId")
    private String vpcAccessId;

    private SetVpcAccessResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vpcAccessId = builder.vpcAccessId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetVpcAccessResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcAccessId
     */
    public String getVpcAccessId() {
        return this.vpcAccessId;
    }

    public static final class Builder {
        private String requestId; 
        private String vpcAccessId; 

        private Builder() {
        } 

        private Builder(SetVpcAccessResponseBody model) {
            this.requestId = model.requestId;
            this.vpcAccessId = model.vpcAccessId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the VPC access authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>4c68e061860f441ab72af7404137440e</p>
         */
        public Builder vpcAccessId(String vpcAccessId) {
            this.vpcAccessId = vpcAccessId;
            return this;
        }

        public SetVpcAccessResponseBody build() {
            return new SetVpcAccessResponseBody(this);
        } 

    } 

}
