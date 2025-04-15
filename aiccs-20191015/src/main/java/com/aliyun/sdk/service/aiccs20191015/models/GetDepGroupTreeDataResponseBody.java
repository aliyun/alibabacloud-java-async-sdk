// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetDepGroupTreeDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetDepGroupTreeDataResponseBody</p>
 */
public class GetDepGroupTreeDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetDepGroupTreeDataResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetDepGroupTreeDataResponseBody build() {
            return new GetDepGroupTreeDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDepGroupTreeDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetDepGroupTreeDataResponseBody</p>
     */
    public static class GroupDTOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
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

            private Builder() {
            } 

            private Builder(GroupDTOS model) {
                this.name = model.name;
                this.skillGroupId = model.skillGroupId;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SkillGroupId.
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
    /**
     * 
     * {@link GetDepGroupTreeDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetDepGroupTreeDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DepGroupId")
        private String depGroupId;

        @com.aliyun.core.annotation.NameInMap("DepGroupName")
        private String depGroupName;

        @com.aliyun.core.annotation.NameInMap("GroupDTOS")
        private java.util.List<GroupDTOS> groupDTOS;

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
        public java.util.List<GroupDTOS> getGroupDTOS() {
            return this.groupDTOS;
        }

        public static final class Builder {
            private String depGroupId; 
            private String depGroupName; 
            private java.util.List<GroupDTOS> groupDTOS; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.depGroupId = model.depGroupId;
                this.depGroupName = model.depGroupName;
                this.groupDTOS = model.groupDTOS;
            } 

            /**
             * DepGroupId.
             */
            public Builder depGroupId(String depGroupId) {
                this.depGroupId = depGroupId;
                return this;
            }

            /**
             * DepGroupName.
             */
            public Builder depGroupName(String depGroupName) {
                this.depGroupName = depGroupName;
                return this;
            }

            /**
             * GroupDTOS.
             */
            public Builder groupDTOS(java.util.List<GroupDTOS> groupDTOS) {
                this.groupDTOS = groupDTOS;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
