// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckDetailResponseBody</p>
 */
public class GetCheckDetailResponseBody extends TeaModel {
    @NameInMap("AssistInfo")
    private AssistInfo assistInfo;

    @NameInMap("Description")
    private Description description;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Solution")
    private Solution solution;

    private GetCheckDetailResponseBody(Builder builder) {
        this.assistInfo = builder.assistInfo;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.solution = builder.solution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return assistInfo
     */
    public AssistInfo getAssistInfo() {
        return this.assistInfo;
    }

    /**
     * @return description
     */
    public Description getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return solution
     */
    public Solution getSolution() {
        return this.solution;
    }

    public static final class Builder {
        private AssistInfo assistInfo; 
        private Description description; 
        private String requestId; 
        private Solution solution; 

        /**
         * The help information about the check item.
         */
        public Builder assistInfo(AssistInfo assistInfo) {
            this.assistInfo = assistInfo;
            return this;
        }

        /**
         * The description of the check item.
         */
        public Builder description(Description description) {
            this.description = description;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The solution to handle the risk item.
         */
        public Builder solution(Solution solution) {
            this.solution = solution;
            return this;
        }

        public GetCheckDetailResponseBody build() {
            return new GetCheckDetailResponseBody(this);
        } 

    } 

    public static class AssistInfo extends TeaModel {
        @NameInMap("Link")
        private String link;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private AssistInfo(Builder builder) {
            this.link = builder.link;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssistInfo create() {
            return builder().build();
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String link; 
            private String type; 
            private String value; 

            /**
             * The link to the help information about the risk item when the Type parameter is set to link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * The type of the help information about the risk item. Valid values:
             * <p>
             * 
             * *   **text**
             * *   **link**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The content in the help information about the risk item when the Type parameter is set to text.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AssistInfo build() {
                return new AssistInfo(this);
            } 

        } 

    }
    public static class Description extends TeaModel {
        @NameInMap("Link")
        private String link;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private Description(Builder builder) {
            this.link = builder.link;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Description create() {
            return builder().build();
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String link; 
            private String type; 
            private String value; 

            /**
             * The link to the description of the check item.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * The type of the description of the check item. The value is fixed as text.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The content in the description of the check item.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Description build() {
                return new Description(this);
            } 

        } 

    }
    public static class Solution extends TeaModel {
        @NameInMap("Link")
        private String link;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private Solution(Builder builder) {
            this.link = builder.link;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Solution create() {
            return builder().build();
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String link; 
            private String type; 
            private String value; 

            /**
             * The link to the solution to handle the risk item when the Type parameter is set to link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * The type of the solution to handle to the risk item. Valid values:
             * <p>
             * 
             * *   **text**
             * *   **link**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The content of the solution to handle the risk item when the Type parameter is set to text.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Solution build() {
                return new Solution(this);
            } 

        } 

    }
}
