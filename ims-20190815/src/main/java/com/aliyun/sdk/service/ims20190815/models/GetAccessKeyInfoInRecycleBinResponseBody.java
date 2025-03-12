// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetAccessKeyInfoInRecycleBinResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyInfoInRecycleBinResponseBody</p>
 */
public class GetAccessKeyInfoInRecycleBinResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKey")
    private AccessKey accessKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAccessKeyInfoInRecycleBinResponseBody(Builder builder) {
        this.accessKey = builder.accessKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyInfoInRecycleBinResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessKey
     */
    public AccessKey getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessKey accessKey; 
        private String requestId; 

        /**
         * <p>The information about the AccessKey pair.</p>
         */
        public Builder accessKey(AccessKey accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4507D1CD-526A-4E2B-A1E2-3AB045D1EE0B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessKeyInfoInRecycleBinResponseBody build() {
            return new GetAccessKeyInfoInRecycleBinResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccessKeyInfoInRecycleBinResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccessKeyInfoInRecycleBinResponseBody</p>
     */
    public static class AccessKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DeleteDate")
        private String deleteDate;

        @com.aliyun.core.annotation.NameInMap("RecycleDate")
        private String recycleDate;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
        private String userPrincipalName;

        @com.aliyun.core.annotation.NameInMap("UserRecycled")
        private Boolean userRecycled;

        private AccessKey(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.createDate = builder.createDate;
            this.deleteDate = builder.deleteDate;
            this.recycleDate = builder.recycleDate;
            this.userId = builder.userId;
            this.userPrincipalName = builder.userPrincipalName;
            this.userRecycled = builder.userRecycled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessKey create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return deleteDate
         */
        public String getDeleteDate() {
            return this.deleteDate;
        }

        /**
         * @return recycleDate
         */
        public String getRecycleDate() {
            return this.recycleDate;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userPrincipalName
         */
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        /**
         * @return userRecycled
         */
        public Boolean getUserRecycled() {
            return this.userRecycled;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String createDate; 
            private String deleteDate; 
            private String recycleDate; 
            private String userId; 
            private String userPrincipalName; 
            private Boolean userRecycled; 

            /**
             * <p>The AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAI4GFTgcR8m8cZQDTH****</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The time when the AccessKey pair was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-12T09:12:00Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The time when the AccessKey pair will be permanently deleted from the recycle bin.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-12T10:12:00Z</p>
             */
            public Builder deleteDate(String deleteDate) {
                this.deleteDate = deleteDate;
                return this;
            }

            /**
             * <p>The time when the AccessKey pair was deleted and moved to the recycle bin.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-12T10:12:00Z</p>
             */
            public Builder recycleDate(String recycleDate) {
                this.recycleDate = recycleDate;
                return this;
            }

            /**
             * <p>The ID of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>20732900249392****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The logon name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
             */
            public Builder userPrincipalName(String userPrincipalName) {
                this.userPrincipalName = userPrincipalName;
                return this;
            }

            /**
             * <p>Indicates whether the RAM user to which the AccessKey pair belongs is in the recycle bin. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder userRecycled(Boolean userRecycled) {
                this.userRecycled = userRecycled;
                return this;
            }

            public AccessKey build() {
                return new AccessKey(this);
            } 

        } 

    }
}
