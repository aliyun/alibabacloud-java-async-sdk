// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryDeviceGroupInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceGroupInfoResponseBody</p>
 */
public class QueryDeviceGroupInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDeviceGroupInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceGroupInfoResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryDeviceGroupInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The group details returned if the call succeeds. This parameter includes the following parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7411716B-A488-4EEB-9AA0-6DB05AD2491F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDeviceGroupInfoResponseBody build() {
            return new QueryDeviceGroupInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceGroupInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceGroupInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceActive")
        private Integer deviceActive;

        @com.aliyun.core.annotation.NameInMap("DeviceCount")
        private Integer deviceCount;

        @com.aliyun.core.annotation.NameInMap("DeviceOnline")
        private Integer deviceOnline;

        @com.aliyun.core.annotation.NameInMap("DynamicGroupExpression")
        private String dynamicGroupExpression;

        @com.aliyun.core.annotation.NameInMap("GroupDesc")
        private String groupDesc;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        private Data(Builder builder) {
            this.deviceActive = builder.deviceActive;
            this.deviceCount = builder.deviceCount;
            this.deviceOnline = builder.deviceOnline;
            this.dynamicGroupExpression = builder.dynamicGroupExpression;
            this.groupDesc = builder.groupDesc;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.utcCreate = builder.utcCreate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceActive
         */
        public Integer getDeviceActive() {
            return this.deviceActive;
        }

        /**
         * @return deviceCount
         */
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        /**
         * @return deviceOnline
         */
        public Integer getDeviceOnline() {
            return this.deviceOnline;
        }

        /**
         * @return dynamicGroupExpression
         */
        public String getDynamicGroupExpression() {
            return this.dynamicGroupExpression;
        }

        /**
         * @return groupDesc
         */
        public String getGroupDesc() {
            return this.groupDesc;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public static final class Builder {
            private Integer deviceActive; 
            private Integer deviceCount; 
            private Integer deviceOnline; 
            private String dynamicGroupExpression; 
            private String groupDesc; 
            private String groupId; 
            private String groupName; 
            private String utcCreate; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deviceActive = model.deviceActive;
                this.deviceCount = model.deviceCount;
                this.deviceOnline = model.deviceOnline;
                this.dynamicGroupExpression = model.dynamicGroupExpression;
                this.groupDesc = model.groupDesc;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.utcCreate = model.utcCreate;
            } 

            /**
             * <p>The number of activated devices.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deviceActive(Integer deviceActive) {
                this.deviceActive = deviceActive;
                return this;
            }

            /**
             * <p>The total number of devices.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder deviceCount(Integer deviceCount) {
                this.deviceCount = deviceCount;
                return this;
            }

            /**
             * <p>The number of online devices.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deviceOnline(Integer deviceOnline) {
                this.deviceOnline = deviceOnline;
                return this;
            }

            /**
             * <p>The rule of the dynamic group. This parameter is returned if a dynamic group is queried.</p>
             * 
             * <strong>example:</strong>
             * <p>product_key = &quot;a1***&quot; and name LIKE &quot;test%&quot;</p>
             */
            public Builder dynamicGroupExpression(String dynamicGroupExpression) {
                this.dynamicGroupExpression = dynamicGroupExpression;
                return this;
            }

            /**
             * <p>The description of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>usefulGroup</p>
             */
            public Builder groupDesc(String groupDesc) {
                this.groupDesc = groupDesc;
                return this;
            }

            /**
             * <p>The ID of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>tDQvBJqbUyHs****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The time when the group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-14T14:35:51.000Z</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
