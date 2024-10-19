// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceResponseBody</p>
 */
public class CreateInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagStatus")
    private Boolean tagStatus;

    private CreateInstanceResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.tagStatus = builder.tagStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagStatus
     */
    public Boolean getTagStatus() {
        return this.tagStatus;
    }

    public static final class Builder {
        private String instanceId; 
        private String requestId; 
        private Boolean tagStatus; 

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>apigateway-hz-b3c5dadd5***</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>CEB6EC62-B6C7-5082-A45A-45A204724AC2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the tag exists. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder tagStatus(Boolean tagStatus) {
            this.tagStatus = tagStatus;
            return this;
        }

        public CreateInstanceResponseBody build() {
            return new CreateInstanceResponseBody(this);
        } 

    } 

}
