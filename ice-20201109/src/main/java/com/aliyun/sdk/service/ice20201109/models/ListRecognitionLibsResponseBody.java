// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListRecognitionLibsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecognitionLibsResponseBody</p>
 */
public class ListRecognitionLibsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Libs")
    private Libs libs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRecognitionLibsResponseBody(Builder builder) {
        this.libs = builder.libs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecognitionLibsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libs
     */
    public Libs getLibs() {
        return this.libs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Libs libs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRecognitionLibsResponseBody model) {
            this.libs = model.libs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The recognition libraries.</p>
         */
        public Builder libs(Libs libs) {
            this.libs = libs;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRecognitionLibsResponseBody build() {
            return new ListRecognitionLibsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecognitionLibsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecognitionLibsResponseBody</p>
     */
    public static class Lib extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LibDescription")
        private String libDescription;

        @com.aliyun.core.annotation.NameInMap("LibId")
        private String libId;

        @com.aliyun.core.annotation.NameInMap("LibName")
        private String libName;

        private Lib(Builder builder) {
            this.libDescription = builder.libDescription;
            this.libId = builder.libId;
            this.libName = builder.libName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lib create() {
            return builder().build();
        }

        /**
         * @return libDescription
         */
        public String getLibDescription() {
            return this.libDescription;
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

        public static final class Builder {
            private String libDescription; 
            private String libId; 
            private String libName; 

            private Builder() {
            } 

            private Builder(Lib model) {
                this.libDescription = model.libDescription;
                this.libId = model.libId;
                this.libName = model.libName;
            } 

            /**
             * <p>The description of the recognition library.</p>
             */
            public Builder libDescription(String libDescription) {
                this.libDescription = libDescription;
                return this;
            }

            /**
             * <p>The ID of the recognition library.</p>
             * 
             * <strong>example:</strong>
             * <p><em><strong><strong><strong><strong><strong><strong>24b47865c6</strong></strong></strong></strong></strong></strong></em>*</p>
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * <p>The name of the recognition library.</p>
             */
            public Builder libName(String libName) {
                this.libName = libName;
                return this;
            }

            public Lib build() {
                return new Lib(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecognitionLibsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecognitionLibsResponseBody</p>
     */
    public static class Libs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Lib")
        private java.util.List<Lib> lib;

        private Libs(Builder builder) {
            this.lib = builder.lib;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Libs create() {
            return builder().build();
        }

        /**
         * @return lib
         */
        public java.util.List<Lib> getLib() {
            return this.lib;
        }

        public static final class Builder {
            private java.util.List<Lib> lib; 

            private Builder() {
            } 

            private Builder(Libs model) {
                this.lib = model.lib;
            } 

            /**
             * Lib.
             */
            public Builder lib(java.util.List<Lib> lib) {
                this.lib = lib;
                return this;
            }

            public Libs build() {
                return new Libs(this);
            } 

        } 

    }
}
