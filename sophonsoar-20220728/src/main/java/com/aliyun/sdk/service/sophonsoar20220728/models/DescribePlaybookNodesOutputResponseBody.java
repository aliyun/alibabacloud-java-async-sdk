// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePlaybookNodesOutputResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlaybookNodesOutputResponseBody</p>
 */
public class DescribePlaybookNodesOutputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PlaybookNodesOutput")
    private PlaybookNodesOutput playbookNodesOutput;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePlaybookNodesOutputResponseBody(Builder builder) {
        this.playbookNodesOutput = builder.playbookNodesOutput;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlaybookNodesOutputResponseBody create() {
        return builder().build();
    }

    /**
     * @return playbookNodesOutput
     */
    public PlaybookNodesOutput getPlaybookNodesOutput() {
        return this.playbookNodesOutput;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PlaybookNodesOutput playbookNodesOutput; 
        private String requestId; 

        /**
         * <p>The output data of the component node.</p>
         */
        public Builder playbookNodesOutput(PlaybookNodesOutput playbookNodesOutput) {
            this.playbookNodesOutput = playbookNodesOutput;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A491170C-FE1F-520E-83D4-72ED205B72ED</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlaybookNodesOutputResponseBody build() {
            return new DescribePlaybookNodesOutputResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlaybookNodesOutputResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlaybookNodesOutputResponseBody</p>
     */
    public static class PlaybookNodesOutput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeOutput")
        private String nodeOutput;

        private PlaybookNodesOutput(Builder builder) {
            this.nodeName = builder.nodeName;
            this.nodeOutput = builder.nodeOutput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlaybookNodesOutput create() {
            return builder().build();
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeOutput
         */
        public String getNodeOutput() {
            return this.nodeOutput;
        }

        public static final class Builder {
            private String nodeName; 
            private String nodeOutput; 

            /**
             * <p>The name of the component node.</p>
             * 
             * <strong>example:</strong>
             * <p>DataFormat_1</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The historical output data of the component node. The value is in the JSON string format. If no data is found, the parameter is left empty.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;datalist&quot;: [
             *         {
             *             &quot;score&quot;: &quot;10&quot;,
             *             &quot;ip&quot;: &quot;1.1.1.1&quot;
             *         }
             *     ],
             *     &quot;total_data_successful&quot;: 1,
             *     &quot;filter_total_data&quot;: 1,
             *     &quot;total_data&quot;: 1,
             *     &quot;total_exe_successful&quot;: 1,
             *     &quot;total_exe&quot;: 1,
             *     &quot;total_data_with_dup&quot;: 1,
             *     &quot;filter_total_data_successful&quot;: 1,
             *     &quot;status&quot;: true
             * }</p>
             */
            public Builder nodeOutput(String nodeOutput) {
                this.nodeOutput = nodeOutput;
                return this;
            }

            public PlaybookNodesOutput build() {
                return new PlaybookNodesOutput(this);
            } 

        } 

    }
}
