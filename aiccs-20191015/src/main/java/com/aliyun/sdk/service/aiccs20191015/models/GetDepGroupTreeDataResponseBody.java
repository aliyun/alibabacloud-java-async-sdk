// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDepGroupTreeDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetDepGroupTreeDataResponseBody</p>
 */
public class GetDepGroupTreeDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private GetDepGroupTreeDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDepGroupTreeDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * Code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetDepGroupTreeDataResponseBody build() {
            return new GetDepGroupTreeDataResponseBody(this);
        } 

    } 

    public static class GroupDTOS extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("SkillGroupId")
        private Long skillGroupId;

        private GroupDTOS(Builder builder) {
            this.name = builder.name;
            this.skillGroupId = builder.skillGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupDTOS create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skillGroupId
         */
        public Long getSkillGroupId() {
            return this.skillGroupId;
        }

        public static final class Builder {
            private String name; 
            private Long skillGroupId; 

            /**
             * name
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * skillGroupId
             */
            public Builder skillGroupId(Long skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            public GroupDTOS build() {
                return new GroupDTOS(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DepGroupId")
        private String depGroupId;

        @NameInMap("DepGroupName")
        private String depGroupName;

        @NameInMap("GroupDTOS")
        private java.util.List < GroupDTOS> groupDTOS;

        private Data(Builder builder) {
            this.depGroupId = builder.depGroupId;
            this.depGroupName = builder.depGroupName;
            this.groupDTOS = builder.groupDTOS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return depGroupId
         */
        public String getDepGroupId() {
            return this.depGroupId;
        }

        /**
         * @return depGroupName
         */
        public String getDepGroupName() {
            return this.depGroupName;
        }

        /**
         * @return groupDTOS
         */
        public java.util.List < GroupDTOS> getGroupDTOS() {
            return this.groupDTOS;
        }

        public static final class Builder {
            private String depGroupId; 
            private String depGroupName; 
            private java.util.List < GroupDTOS> groupDTOS; 

            /**
             * depGroupId
             */
            public Builder depGroupId(String depGroupId) {
                this.depGroupId = depGroupId;
                return this;
            }

            /**
             * depGroupName
             */
            public Builder depGroupName(String depGroupName) {
                this.depGroupName = depGroupName;
                return this;
            }

            /**
             * groupDTOS
             */
            public Builder groupDTOS(java.util.List < GroupDTOS> groupDTOS) {
                this.groupDTOS = groupDTOS;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
