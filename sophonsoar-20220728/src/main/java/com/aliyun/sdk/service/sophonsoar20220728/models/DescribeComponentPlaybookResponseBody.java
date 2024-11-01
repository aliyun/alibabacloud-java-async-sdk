// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeComponentPlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComponentPlaybookResponseBody</p>
 */
public class DescribeComponentPlaybookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Playbooks")
    private java.util.List < Playbooks> playbooks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeComponentPlaybookResponseBody(Builder builder) {
        this.playbooks = builder.playbooks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentPlaybookResponseBody create() {
        return builder().build();
    }

    /**
     * @return playbooks
     */
    public java.util.List < Playbooks> getPlaybooks() {
        return this.playbooks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Playbooks> playbooks; 
        private String requestId; 

        /**
         * <p>The information about the predefined components.</p>
         */
        public Builder playbooks(java.util.List < Playbooks> playbooks) {
            this.playbooks = playbooks;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C5F5D6C9-DF1A-5381-92B1-39676F777D20</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComponentPlaybookResponseBody build() {
            return new DescribeComponentPlaybookResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeComponentPlaybookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeComponentPlaybookResponseBody</p>
     */
    public static class Playbooks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("InputParams")
        private String inputParams;

        private Playbooks(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.inputParams = builder.inputParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Playbooks create() {
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
         * @return inputParams
         */
        public String getInputParams() {
            return this.inputParams;
        }

        public static final class Builder {
            private String description; 
            private String displayName; 
            private String inputParams; 

            /**
             * <p>The description of the predefined component.</p>
             * 
             * <strong>example:</strong>
             * <p>aegis_kill_process</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the predefined component.</p>
             * 
             * <strong>example:</strong>
             * <p>AegisKillQuara</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The input parameter configuration of the playbook. The value is a JSON array.</p>
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
            public Builder inputParams(String inputParams) {
                this.inputParams = inputParams;
                return this;
            }

            public Playbooks build() {
                return new Playbooks(this);
            } 

        } 

    }
}
