// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConsumerChannelRequest} extends {@link RequestModel}
 *
 * <p>CreateConsumerChannelRequest</p>
 */
public class CreateConsumerChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupUserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateConsumerChannelRequest(Builder builder) {
        super(builder);
        this.consumerGroupName = builder.consumerGroupName;
        this.consumerGroupPassword = builder.consumerGroupPassword;
        this.consumerGroupUserName = builder.consumerGroupUserName;
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerChannelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerGroupName
     */
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * @return consumerGroupPassword
     */
    public String getConsumerGroupPassword() {
        return this.consumerGroupPassword;
    }

    /**
     * @return consumerGroupUserName
     */
    public String getConsumerGroupUserName() {
        return this.consumerGroupUserName;
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateConsumerChannelRequest, Builder> {
        private String consumerGroupName; 
        private String consumerGroupPassword; 
        private String consumerGroupUserName; 
        private String dtsInstanceId; 
        private String dtsJobId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateConsumerChannelRequest request) {
            super(request);
            this.consumerGroupName = request.consumerGroupName;
            this.consumerGroupPassword = request.consumerGroupPassword;
            this.consumerGroupUserName = request.consumerGroupUserName;
            this.dtsInstanceId = request.dtsInstanceId;
            this.dtsJobId = request.dtsJobId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The name of the consumer group. The name can be up to 128 characters in length. We recommend that you use an informative name for easy identification.
         */
        public Builder consumerGroupName(String consumerGroupName) {
            this.putQueryParameter("ConsumerGroupName", consumerGroupName);
            this.consumerGroupName = consumerGroupName;
            return this;
        }

        /**
         * The password of the consumer group.
         * <p>
         * 
         * *   A password must contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.
         * *   A password must be 8 to 32 characters in length.
         */
        public Builder consumerGroupPassword(String consumerGroupPassword) {
            this.putQueryParameter("ConsumerGroupPassword", consumerGroupPassword);
            this.consumerGroupPassword = consumerGroupPassword;
            return this;
        }

        /**
         * The username of the consumer group.
         * <p>
         * 
         * *   A username must contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (\_).
         * *   A username cannot exceed 16 characters in length.
         */
        public Builder consumerGroupUserName(String consumerGroupUserName) {
            this.putQueryParameter("ConsumerGroupUserName", consumerGroupUserName);
            this.consumerGroupUserName = consumerGroupUserName;
            return this;
        }

        /**
         * The ID of the change tracking instance. You can call the [DescribeDtsJobs](~~209702~~) operation to query the instance ID.
         * <p>
         * 
         * >  You must specify at least one of the **DtsInstanceId** and **DtsJobId**. parameters.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * The ID of the change tracking task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.
         * <p>
         * 
         * >  You must specify at least one of the **DtsInstanceId** and **DtsJobId**. parameters.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The ID of the region where the change tracking instance resides. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CreateConsumerChannelRequest build() {
            return new CreateConsumerChannelRequest(this);
        } 

    } 

}
