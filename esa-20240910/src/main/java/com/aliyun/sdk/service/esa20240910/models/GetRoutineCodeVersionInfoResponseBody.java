// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetRoutineCodeVersionInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoutineCodeVersionInfoResponseBody</p>
 */
public class GetRoutineCodeVersionInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuildId")
    private Long buildId;

    @com.aliyun.core.annotation.NameInMap("CodeDescription")
    private String codeDescription;

    @com.aliyun.core.annotation.NameInMap("CodeVersion")
    private String codeVersion;

    @com.aliyun.core.annotation.NameInMap("ConfOptions")
    private ConfOptions confOptions;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.NameInMap("HasAssets")
    private Boolean hasAssets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetRoutineCodeVersionInfoResponseBody(Builder builder) {
        this.buildId = builder.buildId;
        this.codeDescription = builder.codeDescription;
        this.codeVersion = builder.codeVersion;
        this.confOptions = builder.confOptions;
        this.createTime = builder.createTime;
        this.extraInfo = builder.extraInfo;
        this.hasAssets = builder.hasAssets;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineCodeVersionInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildId
     */
    public Long getBuildId() {
        return this.buildId;
    }

    /**
     * @return codeDescription
     */
    public String getCodeDescription() {
        return this.codeDescription;
    }

    /**
     * @return codeVersion
     */
    public String getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * @return confOptions
     */
    public ConfOptions getConfOptions() {
        return this.confOptions;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return hasAssets
     */
    public Boolean getHasAssets() {
        return this.hasAssets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long buildId; 
        private String codeDescription; 
        private String codeVersion; 
        private ConfOptions confOptions; 
        private String createTime; 
        private String extraInfo; 
        private Boolean hasAssets; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetRoutineCodeVersionInfoResponseBody model) {
            this.buildId = model.buildId;
            this.codeDescription = model.codeDescription;
            this.codeVersion = model.codeVersion;
            this.confOptions = model.confOptions;
            this.createTime = model.createTime;
            this.extraInfo = model.extraInfo;
            this.hasAssets = model.hasAssets;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * BuildId.
         */
        public Builder buildId(Long buildId) {
            this.buildId = buildId;
            return this;
        }

        /**
         * CodeDescription.
         */
        public Builder codeDescription(String codeDescription) {
            this.codeDescription = codeDescription;
            return this;
        }

        /**
         * CodeVersion.
         */
        public Builder codeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * ConfOptions.
         */
        public Builder confOptions(ConfOptions confOptions) {
            this.confOptions = confOptions;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * HasAssets.
         */
        public Builder hasAssets(Boolean hasAssets) {
            this.hasAssets = hasAssets;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetRoutineCodeVersionInfoResponseBody build() {
            return new GetRoutineCodeVersionInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRoutineCodeVersionInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoutineCodeVersionInfoResponseBody</p>
     */
    public static class ConfOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotFoundStrategy")
        private String notFoundStrategy;

        private ConfOptions(Builder builder) {
            this.notFoundStrategy = builder.notFoundStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfOptions create() {
            return builder().build();
        }

        /**
         * @return notFoundStrategy
         */
        public String getNotFoundStrategy() {
            return this.notFoundStrategy;
        }

        public static final class Builder {
            private String notFoundStrategy; 

            private Builder() {
            } 

            private Builder(ConfOptions model) {
                this.notFoundStrategy = model.notFoundStrategy;
            } 

            /**
             * NotFoundStrategy.
             */
            public Builder notFoundStrategy(String notFoundStrategy) {
                this.notFoundStrategy = notFoundStrategy;
                return this;
            }

            public ConfOptions build() {
                return new ConfOptions(this);
            } 

        } 

    }
}
