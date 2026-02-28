// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link UpdateOTAJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateOTAJobRequest</p>
 */
public class UpdateOTAJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximumPerMinute")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 10)
    private Integer maximumPerMinute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcVersionList")
    private java.util.List<String> srcVersionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetSelection")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetSelection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutInMinutes")
    private Integer timeoutInMinutes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upgradeType;

    private UpdateOTAJobRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.jobId = builder.jobId;
        this.maximumPerMinute = builder.maximumPerMinute;
        this.srcVersionList = builder.srcVersionList;
        this.tags = builder.tags;
        this.targetSelection = builder.targetSelection;
        this.timeoutInMinutes = builder.timeoutInMinutes;
        this.upgradeType = builder.upgradeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOTAJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return maximumPerMinute
     */
    public Integer getMaximumPerMinute() {
        return this.maximumPerMinute;
    }

    /**
     * @return srcVersionList
     */
    public java.util.List<String> getSrcVersionList() {
        return this.srcVersionList;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return targetSelection
     */
    public String getTargetSelection() {
        return this.targetSelection;
    }

    /**
     * @return timeoutInMinutes
     */
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     * @return upgradeType
     */
    public String getUpgradeType() {
        return this.upgradeType;
    }

    public static final class Builder extends Request.Builder<UpdateOTAJobRequest, Builder> {
        private String iotInstanceId; 
        private String jobId; 
        private Integer maximumPerMinute; 
        private java.util.List<String> srcVersionList; 
        private java.util.List<Tags> tags; 
        private String targetSelection; 
        private Integer timeoutInMinutes; 
        private String upgradeType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOTAJobRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.jobId = request.jobId;
            this.maximumPerMinute = request.maximumPerMinute;
            this.srcVersionList = request.srcVersionList;
            this.tags = request.tags;
            this.targetSelection = request.targetSelection;
            this.timeoutInMinutes = request.timeoutInMinutes;
            this.upgradeType = request.upgradeType;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder maximumPerMinute(Integer maximumPerMinute) {
            this.putQueryParameter("MaximumPerMinute", maximumPerMinute);
            this.maximumPerMinute = maximumPerMinute;
            return this;
        }

        /**
         * SrcVersionList.
         */
        public Builder srcVersionList(java.util.List<String> srcVersionList) {
            this.putQueryParameter("SrcVersionList", srcVersionList);
            this.srcVersionList = srcVersionList;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder targetSelection(String targetSelection) {
            this.putQueryParameter("TargetSelection", targetSelection);
            this.targetSelection = targetSelection;
            return this;
        }

        /**
         * TimeoutInMinutes.
         */
        public Builder timeoutInMinutes(Integer timeoutInMinutes) {
            this.putQueryParameter("TimeoutInMinutes", timeoutInMinutes);
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder upgradeType(String upgradeType) {
            this.putQueryParameter("UpgradeType", upgradeType);
            this.upgradeType = upgradeType;
            return this;
        }

        @Override
        public UpdateOTAJobRequest build() {
            return new UpdateOTAJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateOTAJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateOTAJobRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
