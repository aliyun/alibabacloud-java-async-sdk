// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeCustomLinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomLinesResponseBody</p>
 */
public class DescribeCustomLinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomLines")
    private java.util.List<CustomLines> customLines;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeCustomLinesResponseBody(Builder builder) {
        this.customLines = builder.customLines;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomLinesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customLines
     */
    public java.util.List<CustomLines> getCustomLines() {
        return this.customLines;
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
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private java.util.List<CustomLines> customLines; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(DescribeCustomLinesResponseBody model) {
            this.customLines = model.customLines;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalItems = model.totalItems;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>The custom lines.</p>
         */
        public Builder customLines(java.util.List<CustomLines> customLines) {
            this.customLines = customLines;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of custom lines.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeCustomLinesResponseBody build() {
            return new DescribeCustomLinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomLinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomLinesResponseBody</p>
     */
    public static class IpSegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndIp")
        private String endIp;

        @com.aliyun.core.annotation.NameInMap("StartIp")
        private String startIp;

        private IpSegmentList(Builder builder) {
            this.endIp = builder.endIp;
            this.startIp = builder.startIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpSegmentList create() {
            return builder().build();
        }

        /**
         * @return endIp
         */
        public String getEndIp() {
            return this.endIp;
        }

        /**
         * @return startIp
         */
        public String getStartIp() {
            return this.startIp;
        }

        public static final class Builder {
            private String endIp; 
            private String startIp; 

            private Builder() {
            } 

            private Builder(IpSegmentList model) {
                this.endIp = model.endIp;
                this.startIp = model.startIp;
            } 

            /**
             * EndIp.
             */
            public Builder endIp(String endIp) {
                this.endIp = endIp;
                return this;
            }

            /**
             * StartIp.
             */
            public Builder startIp(String startIp) {
                this.startIp = startIp;
                return this;
            }

            public IpSegmentList build() {
                return new IpSegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCustomLinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomLinesResponseBody</p>
     */
    public static class CustomLines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IpSegmentList")
        private java.util.List<IpSegmentList> ipSegmentList;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private CustomLines(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
            this.ipSegmentList = builder.ipSegmentList;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomLines create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ipSegmentList
         */
        public java.util.List<IpSegmentList> getIpSegmentList() {
            return this.ipSegmentList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private Long id; 
            private java.util.List<IpSegmentList> ipSegmentList; 
            private String name; 

            private Builder() {
            } 

            private Builder(CustomLines model) {
                this.code = model.code;
                this.id = model.id;
                this.ipSegmentList = model.ipSegmentList;
                this.name = model.name;
            } 

            /**
             * <p>The code of the custom line.</p>
             * 
             * <strong>example:</strong>
             * <p>hra0yc-597</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The unique ID of the custom line.</p>
             * 
             * <strong>example:</strong>
             * <p>597</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IpSegmentList.
             */
            public Builder ipSegmentList(java.util.List<IpSegmentList> ipSegmentList) {
                this.ipSegmentList = ipSegmentList;
                return this;
            }

            /**
             * <p>The name of the custom line.</p>
             * 
             * <strong>example:</strong>
             * <p>hra0yd-597</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CustomLines build() {
                return new CustomLines(this);
            } 

        } 

    }
}
