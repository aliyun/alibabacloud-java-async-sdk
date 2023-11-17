// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlaybookNodesOutputResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlaybookNodesOutputResponseBody</p>
 */
public class DescribePlaybookNodesOutputResponseBody extends TeaModel {
    @NameInMap("PlaybookNodesOutput")
    private PlaybookNodesOutput playbookNodesOutput;

    @NameInMap("RequestId")
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
         * PlaybookNodesOutput.
         */
        public Builder playbookNodesOutput(PlaybookNodesOutput playbookNodesOutput) {
            this.playbookNodesOutput = playbookNodesOutput;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlaybookNodesOutputResponseBody build() {
            return new DescribePlaybookNodesOutputResponseBody(this);
        } 

    } 

    public static class PlaybookNodesOutput extends TeaModel {
        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("NodeOutput")
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
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * NodeOutput.
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
