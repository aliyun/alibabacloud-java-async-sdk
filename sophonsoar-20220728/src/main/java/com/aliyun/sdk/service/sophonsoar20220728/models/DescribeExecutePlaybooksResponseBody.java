// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExecutePlaybooksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExecutePlaybooksResponseBody</p>
 */
public class DescribeExecutePlaybooksResponseBody extends TeaModel {
    @NameInMap("PlaybookMetrics")
    private java.util.List < PlaybookMetrics> playbookMetrics;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeExecutePlaybooksResponseBody(Builder builder) {
        this.playbookMetrics = builder.playbookMetrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExecutePlaybooksResponseBody create() {
        return builder().build();
    }

    /**
     * @return playbookMetrics
     */
    public java.util.List < PlaybookMetrics> getPlaybookMetrics() {
        return this.playbookMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PlaybookMetrics> playbookMetrics; 
        private String requestId; 

        /**
         * PlaybookMetrics.
         */
        public Builder playbookMetrics(java.util.List < PlaybookMetrics> playbookMetrics) {
            this.playbookMetrics = playbookMetrics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExecutePlaybooksResponseBody build() {
            return new DescribeExecutePlaybooksResponseBody(this);
        } 

    } 

    public static class PlaybookMetrics extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("ParamConfig")
        private String paramConfig;

        @NameInMap("ParamType")
        private String paramType;

        @NameInMap("Uuid")
        private String uuid;

        private PlaybookMetrics(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.paramConfig = builder.paramConfig;
            this.paramType = builder.paramType;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlaybookMetrics create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return paramConfig
         */
        public String getParamConfig() {
            return this.paramConfig;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String description; 
            private String displayName; 
            private String paramConfig; 
            private String paramType; 
            private String uuid; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * ParamConfig.
             */
            public Builder paramConfig(String paramConfig) {
                this.paramConfig = paramConfig;
                return this;
            }

            /**
             * ParamType.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public PlaybookMetrics build() {
                return new PlaybookMetrics(this);
            } 

        } 

    }
}
