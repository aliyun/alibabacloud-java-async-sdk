// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeExecutePlaybooksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExecutePlaybooksResponseBody</p>
 */
public class DescribeExecutePlaybooksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PlaybookMetrics")
    private java.util.List<PlaybookMetrics> playbookMetrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return playbookMetrics
     */
    public java.util.List<PlaybookMetrics> getPlaybookMetrics() {
        return this.playbookMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PlaybookMetrics> playbookMetrics; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeExecutePlaybooksResponseBody model) {
            this.playbookMetrics = model.playbookMetrics;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The playbook.</p>
         */
        public Builder playbookMetrics(java.util.List<PlaybookMetrics> playbookMetrics) {
            this.playbookMetrics = playbookMetrics;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>88A39217-2802-5B1E-BA2B-CF1BBC43C1F5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExecutePlaybooksResponseBody build() {
            return new DescribeExecutePlaybooksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExecutePlaybooksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExecutePlaybooksResponseBody</p>
     */
    public static class PlaybookMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("ParamConfig")
        private String paramConfig;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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

            private Builder() {
            } 

            private Builder(PlaybookMetrics model) {
                this.description = model.description;
                this.displayName = model.displayName;
                this.paramConfig = model.paramConfig;
                this.paramType = model.paramType;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The playbook description.</p>
             * 
             * <strong>example:</strong>
             * <p>a demo playbook</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The playbook name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_playbook</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The configuration of the input parameter. The value is a JSON array.</p>
             * <blockquote>
             * <p> For more information, see <a href="~~DescribePlaybookInputOutput~~">DescribePlaybookInputOutput</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;typeName&quot;: &quot;String&quot;,
             *         &quot;dataClass&quot;: &quot;normal&quot;,
             *         &quot;dataType&quot;: &quot;String&quot;,
             *         &quot;description&quot;: &quot;period&quot;,
             *         &quot;example&quot;: &quot;&quot;,
             *         &quot;name&quot;: &quot;period&quot;,
             *         &quot;required&quot;: false
             *     }
             * ]</p>
             */
            public Builder paramConfig(String paramConfig) {
                this.paramConfig = paramConfig;
                return this;
            }

            /**
             * <p>The input parameter type of the playbook.</p>
             * <ul>
             * <li><strong>template-ip</strong></li>
             * <li><strong>template-file</strong></li>
             * <li><strong>template-process</strong></li>
             * <li><strong>custom</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * <p>The playbook UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>c5c88b5e-97ca-435d-8c20-2xxxxx</p>
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
