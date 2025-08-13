// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeAppKeyPageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppKeyPageResponseBody</p>
 */
public class DescribeAppKeyPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("totalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("totalPage")
    private Integer totalPage;

    private DescribeAppKeyPageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppKeyPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    /**
     * @return totalItem
     */
    public Integer getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String requestId; 
        private Integer currentPage; 
        private Integer pageSize; 
        private java.util.List<ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeAppKeyPageResponseBody model) {
            this.requestId = model.requestId;
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.resultObject = model.resultObject;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E01E1B4A-6747-5329-9046-B6D6B2D91349</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Number of items per page, default value is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Returned object.</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeAppKeyPageResponseBody build() {
            return new DescribeAppKeyPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppKeyPageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppKeyPageResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("androidSdkUrl")
        private String androidSdkUrl;

        @com.aliyun.core.annotation.NameInMap("androidSdkVersion")
        private String androidSdkVersion;

        @com.aliyun.core.annotation.NameInMap("appKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("iosSdkUrl")
        private String iosSdkUrl;

        @com.aliyun.core.annotation.NameInMap("iosSdkVersion")
        private String iosSdkVersion;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("sdkItems")
        private String sdkItems;

        @com.aliyun.core.annotation.NameInMap("used")
        private String used;

        private ResultObject(Builder builder) {
            this.androidSdkUrl = builder.androidSdkUrl;
            this.androidSdkVersion = builder.androidSdkVersion;
            this.appKey = builder.appKey;
            this.gmtCreate = builder.gmtCreate;
            this.iosSdkUrl = builder.iosSdkUrl;
            this.iosSdkVersion = builder.iosSdkVersion;
            this.memo = builder.memo;
            this.sdkItems = builder.sdkItems;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return androidSdkUrl
         */
        public String getAndroidSdkUrl() {
            return this.androidSdkUrl;
        }

        /**
         * @return androidSdkVersion
         */
        public String getAndroidSdkVersion() {
            return this.androidSdkVersion;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return iosSdkUrl
         */
        public String getIosSdkUrl() {
            return this.iosSdkUrl;
        }

        /**
         * @return iosSdkVersion
         */
        public String getIosSdkVersion() {
            return this.iosSdkVersion;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return sdkItems
         */
        public String getSdkItems() {
            return this.sdkItems;
        }

        /**
         * @return used
         */
        public String getUsed() {
            return this.used;
        }

        public static final class Builder {
            private String androidSdkUrl; 
            private String androidSdkVersion; 
            private String appKey; 
            private Long gmtCreate; 
            private String iosSdkUrl; 
            private String iosSdkVersion; 
            private String memo; 
            private String sdkItems; 
            private String used; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.androidSdkUrl = model.androidSdkUrl;
                this.androidSdkVersion = model.androidSdkVersion;
                this.appKey = model.appKey;
                this.gmtCreate = model.gmtCreate;
                this.iosSdkUrl = model.iosSdkUrl;
                this.iosSdkVersion = model.iosSdkVersion;
                this.memo = model.memo;
                this.sdkItems = model.sdkItems;
                this.used = model.used;
            } 

            /**
             * <p>Android SDK download URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&OSSAccessKeyId=xxxxxxxxx&Signature=%2F%xxxxxxxxxxxx%3D">https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&amp;OSSAccessKeyId=xxxxxxxxx&amp;Signature=%2F%xxxxxxxxxxxx%3D</a></p>
             */
            public Builder androidSdkUrl(String androidSdkUrl) {
                this.androidSdkUrl = androidSdkUrl;
                return this;
            }

            /**
             * <p>Android SDK version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder androidSdkVersion(String androidSdkVersion) {
                this.androidSdkVersion = androidSdkVersion;
                return this;
            }

            /**
             * <p>Application appkey.</p>
             * 
             * <strong>example:</strong>
             * <p>sh9a71f07fhs556bd767586307e82795</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1621578648000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>iOS SDK download URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&OSSAccessKeyId=xxxxxxxxx&Signature=%2F%xxxxxxxxxxxx%3D">https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&amp;OSSAccessKeyId=xxxxxxxxx&amp;Signature=%2F%xxxxxxxxxxxx%3D</a></p>
             */
            public Builder iosSdkUrl(String iosSdkUrl) {
                this.iosSdkUrl = iosSdkUrl;
                return this;
            }

            /**
             * <p>iOS SDK version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder iosSdkVersion(String iosSdkVersion) {
                this.iosSdkVersion = iosSdkVersion;
                return this;
            }

            /**
             * <p>Memo.</p>
             * 
             * <strong>example:</strong>
             * <p>备注</p>
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * <p>Deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>已作废</p>
             */
            public Builder sdkItems(String sdkItems) {
                this.sdkItems = sdkItems;
                return this;
            }

            /**
             * <p>Whether this appKey is integrated.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder used(String used) {
                this.used = used;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
