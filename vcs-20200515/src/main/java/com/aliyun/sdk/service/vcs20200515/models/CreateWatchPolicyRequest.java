// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWatchPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateWatchPolicyRequest</p>
 */
public class CreateWatchPolicyRequest extends Request {
    @Body
    @NameInMap("ItemMatchType")
    @Validation(required = true)
    private String itemMatchType;

    @Body
    @NameInMap("SimilarityThreshold")
    private Double similarityThreshold;

    @Body
    @NameInMap("TargetType")
    @Validation(required = true)
    private String targetType;

    @Body
    @NameInMap("WatchMode")
    @Validation(required = true)
    private String watchMode;

    @Body
    @NameInMap("WatchPolicyName")
    private String watchPolicyName;

    private CreateWatchPolicyRequest(Builder builder) {
        super(builder);
        this.itemMatchType = builder.itemMatchType;
        this.similarityThreshold = builder.similarityThreshold;
        this.targetType = builder.targetType;
        this.watchMode = builder.watchMode;
        this.watchPolicyName = builder.watchPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWatchPolicyRequest create() {
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
     * @return watchPolicyName
     */
    public String getWatchPolicyName() {
        return this.watchPolicyName;
    }

    public static final class Builder extends Request.Builder<CreateWatchPolicyRequest, Builder> {
        private String itemMatchType; 
        private Double similarityThreshold; 
        private String targetType; 
        private String watchMode; 
        private String watchPolicyName; 

        private Builder() {
            super();
        } 

        private Builder(CreateWatchPolicyRequest response) {
            super(response);
            this.itemMatchType = response.itemMatchType;
            this.similarityThreshold = response.similarityThreshold;
            this.targetType = response.targetType;
            this.watchMode = response.watchMode;
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
         * WatchPolicyName.
         */
        public Builder watchPolicyName(String watchPolicyName) {
            this.putBodyParameter("WatchPolicyName", watchPolicyName);
            this.watchPolicyName = watchPolicyName;
            return this;
        }

        @Override
        public CreateWatchPolicyRequest build() {
            return new CreateWatchPolicyRequest(this);
        } 

    } 

}
