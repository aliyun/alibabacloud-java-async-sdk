// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWatchPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateWatchPolicyRequest</p>
 */
public class UpdateWatchPolicyRequest extends Request {
    @Body
    @NameInMap("ItemMatchType")
    private String itemMatchType;

    @Body
    @NameInMap("SimilarityThreshold")
    private Double similarityThreshold;

    @Body
    @NameInMap("TargetType")
    private String targetType;

    @Body
    @NameInMap("WatchMode")
    private String watchMode;

    @Body
    @NameInMap("WatchPolicyId")
    @Validation(required = true)
    private String watchPolicyId;

    @Body
    @NameInMap("WatchPolicyName")
    private String watchPolicyName;

    private UpdateWatchPolicyRequest(Builder builder) {
        super(builder);
        this.itemMatchType = builder.itemMatchType;
        this.similarityThreshold = builder.similarityThreshold;
        this.targetType = builder.targetType;
        this.watchMode = builder.watchMode;
        this.watchPolicyId = builder.watchPolicyId;
        this.watchPolicyName = builder.watchPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWatchPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return itemMatchType
     */
    public String getItemMatchType() {
        return this.itemMatchType;
    }

    /**
     * @return similarityThreshold
     */
    public Double getSimilarityThreshold() {
        return this.similarityThreshold;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return watchMode
     */
    public String getWatchMode() {
        return this.watchMode;
    }

    /**
     * @return watchPolicyId
     */
    public String getWatchPolicyId() {
        return this.watchPolicyId;
    }

    /**
     * @return watchPolicyName
     */
    public String getWatchPolicyName() {
        return this.watchPolicyName;
    }

    public static final class Builder extends Request.Builder<UpdateWatchPolicyRequest, Builder> {
        private String itemMatchType; 
        private Double similarityThreshold; 
        private String targetType; 
        private String watchMode; 
        private String watchPolicyId; 
        private String watchPolicyName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWatchPolicyRequest response) {
            super(response);
            this.itemMatchType = response.itemMatchType;
            this.similarityThreshold = response.similarityThreshold;
            this.targetType = response.targetType;
            this.watchMode = response.watchMode;
            this.watchPolicyId = response.watchPolicyId;
            this.watchPolicyName = response.watchPolicyName;
        } 

        /**
         * ItemMatchType.
         */
        public Builder itemMatchType(String itemMatchType) {
            this.putBodyParameter("ItemMatchType", itemMatchType);
            this.itemMatchType = itemMatchType;
            return this;
        }

        /**
         * SimilarityThreshold.
         */
        public Builder similarityThreshold(Double similarityThreshold) {
            this.putBodyParameter("SimilarityThreshold", similarityThreshold);
            this.similarityThreshold = similarityThreshold;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * WatchMode.
         */
        public Builder watchMode(String watchMode) {
            this.putBodyParameter("WatchMode", watchMode);
            this.watchMode = watchMode;
            return this;
        }

        /**
         * WatchPolicyId.
         */
        public Builder watchPolicyId(String watchPolicyId) {
            this.putBodyParameter("WatchPolicyId", watchPolicyId);
            this.watchPolicyId = watchPolicyId;
            return this;
        }

        /**
         * WatchPolicyName.
         */
        public Builder watchPolicyName(String watchPolicyName) {
            this.putBodyParameter("WatchPolicyName", watchPolicyName);
            this.watchPolicyName = watchPolicyName;
            return this;
        }

        @Override
        public UpdateWatchPolicyRequest build() {
            return new UpdateWatchPolicyRequest(this);
        } 

    } 

}
