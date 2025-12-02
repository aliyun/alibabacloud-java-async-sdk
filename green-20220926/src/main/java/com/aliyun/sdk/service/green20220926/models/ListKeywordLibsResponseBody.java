// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ListKeywordLibsResponseBody} extends {@link TeaModel}
 *
 * <p>ListKeywordLibsResponseBody</p>
 */
public class ListKeywordLibsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListKeywordLibsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKeywordLibsResponseBody create() {
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
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListKeywordLibsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Further description of the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>ID assigned by the backend to uniquely identify a request. Can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Success indicator.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListKeywordLibsResponseBody build() {
            return new ListKeywordLibsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKeywordLibsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKeywordLibsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("KeywordCount")
        private String keywordCount;

        @com.aliyun.core.annotation.NameInMap("LibId")
        private String libId;

        @com.aliyun.core.annotation.NameInMap("LibName")
        private String libName;

        @com.aliyun.core.annotation.NameInMap("ServiceCodes")
        private String serviceCodes;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private Data(Builder builder) {
            this.gmtModified = builder.gmtModified;
            this.keywordCount = builder.keywordCount;
            this.libId = builder.libId;
            this.libName = builder.libName;
            this.serviceCodes = builder.serviceCodes;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return keywordCount
         */
        public String getKeywordCount() {
            return this.keywordCount;
        }

        /**
         * @return libId
         */
        public String getLibId() {
            return this.libId;
        }

        /**
         * @return libName
         */
        public String getLibName() {
            return this.libName;
        }

        /**
         * @return serviceCodes
         */
        public String getServiceCodes() {
            return this.serviceCodes;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String gmtModified; 
            private String keywordCount; 
            private String libId; 
            private String libName; 
            private String serviceCodes; 
            private String uid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gmtModified = model.gmtModified;
                this.keywordCount = model.keywordCount;
                this.libId = model.libId;
                this.libName = model.libName;
                this.serviceCodes = model.serviceCodes;
                this.uid = model.uid;
            } 

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-30 16:30:29</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Number of keywords.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder keywordCount(String keywordCount) {
                this.keywordCount = keywordCount;
                return this;
            }

            /**
             * <p>Library ID.</p>
             * 
             * <strong>example:</strong>
             * <p>custom_xxxxx</p>
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * <p>Library name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试</p>
             */
            public Builder libName(String libName) {
                this.libName = libName;
                return this;
            }

            /**
             * <p>Service codes.</p>
             * 
             * <strong>example:</strong>
             * <p>service1,service2</p>
             */
            public Builder serviceCodes(String serviceCodes) {
                this.serviceCodes = serviceCodes;
                return this;
            }

            /**
             * <p>UID.</p>
             * 
             * <strong>example:</strong>
             * <p>19964*****086772</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
