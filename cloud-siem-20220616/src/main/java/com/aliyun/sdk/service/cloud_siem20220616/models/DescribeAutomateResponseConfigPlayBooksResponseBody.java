// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeAutomateResponseConfigPlayBooksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutomateResponseConfigPlayBooksResponseBody</p>
 */
public class DescribeAutomateResponseConfigPlayBooksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAutomateResponseConfigPlayBooksResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutomateResponseConfigPlayBooksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeAutomateResponseConfigPlayBooksResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAutomateResponseConfigPlayBooksResponseBody build() {
            return new DescribeAutomateResponseConfigPlayBooksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAutomateResponseConfigPlayBooksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutomateResponseConfigPlayBooksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.paramType = builder.paramType;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String name; 
            private String paramType; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.displayName = model.displayName;
                this.name = model.name;
                this.paramType = model.paramType;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The description of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>Waf Block IP</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>WafBlockIP</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The unique identifier name of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>WafBlockIP</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The input parameter template of the playbook. Valid values:</p>
             * <ul>
             * <li>template-ip: IP address</li>
             * <li>template-process: process</li>
             * <li>template-filee: file</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>template-ip</p>
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * <p>The UUID of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>system_aliyun_clb_process_book</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
