// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

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
    private CustomLines customLines;

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

    /**
     * @return customLines
     */
    public CustomLines getCustomLines() {
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
        private CustomLines customLines; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * <p>The custom lines.</p>
         */
        public Builder customLines(CustomLines customLines) {
            this.customLines = customLines;
            return this;
        }

        /**
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: <strong>10</strong>.</p>
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
         * <p>AF7D4DCE-0776-47F2-A9B2-6FB85A87AA60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
    public static class Ipv4s extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4")
        private java.util.List < String > ipv4;

        private Ipv4s(Builder builder) {
            this.ipv4 = builder.ipv4;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4s create() {
            return builder().build();
        }

        /**
         * @return ipv4
         */
        public java.util.List < String > getIpv4() {
            return this.ipv4;
        }

        public static final class Builder {
            private java.util.List < String > ipv4; 

            /**
             * Ipv4.
             */
            public Builder ipv4(java.util.List < String > ipv4) {
                this.ipv4 = ipv4;
                return this;
            }

            public Ipv4s build() {
                return new Ipv4s(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCustomLinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomLinesResponseBody</p>
     */
    public static class CustomLine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorSubType")
        private String creatorSubType;

        @com.aliyun.core.annotation.NameInMap("CreatorType")
        private String creatorType;

        @com.aliyun.core.annotation.NameInMap("Ipv4s")
        private Ipv4s ipv4s;

        @com.aliyun.core.annotation.NameInMap("LineId")
        private String lineId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        private CustomLine(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.creator = builder.creator;
            this.creatorSubType = builder.creatorSubType;
            this.creatorType = builder.creatorType;
            this.ipv4s = builder.ipv4s;
            this.lineId = builder.lineId;
            this.name = builder.name;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomLine create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorSubType
         */
        public String getCreatorSubType() {
            return this.creatorSubType;
        }

        /**
         * @return creatorType
         */
        public String getCreatorType() {
            return this.creatorType;
        }

        /**
         * @return ipv4s
         */
        public Ipv4s getIpv4s() {
            return this.ipv4s;
        }

        /**
         * @return lineId
         */
        public String getLineId() {
            return this.lineId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private String createTime; 
            private Long createTimestamp; 
            private String creator; 
            private String creatorSubType; 
            private String creatorType; 
            private Ipv4s ipv4s; 
            private String lineId; 
            private String name; 
            private String updateTime; 
            private Long updateTimestamp; 

            /**
             * <p>The time when the custom line was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-25T08:07Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the custom line was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1671174074000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The creator of the custom line.</p>
             * 
             * <strong>example:</strong>
             * <p>21312421</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The type of the creator for the custom line. Valid values:</p>
             * <ul>
             * <li>CUSTOM: Alibaba Cloud account</li>
             * <li>SUB: RAM user</li>
             * <li>STS: assumed role that obtains the Security Token Service (STS) token of a RAM role</li>
             * <li>OTHER: other roles</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUB</p>
             */
            public Builder creatorSubType(String creatorSubType) {
                this.creatorSubType = creatorSubType;
                return this;
            }

            /**
             * <p>The role of the creator for the custom line. Valid values:</p>
             * <ul>
             * <li>USER: user</li>
             * <li>SYSTEM: system</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder creatorType(String creatorType) {
                this.creatorType = creatorType;
                return this;
            }

            /**
             * <p>The IPv4 CIDR blocks.</p>
             */
            public Builder ipv4s(Ipv4s ipv4s) {
                this.ipv4s = ipv4s;
                return this;
            }

            /**
             * <p>The unique ID of the custom line.</p>
             * 
             * <strong>example:</strong>
             * <p>160002</p>
             */
            public Builder lineId(String lineId) {
                this.lineId = lineId;
                return this;
            }

            /**
             * <p>The name of the custom line.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the custom line was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-08-24T16:08Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The time when the custom line was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1681879029000</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public CustomLine build() {
                return new CustomLine(this);
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
        @com.aliyun.core.annotation.NameInMap("CustomLine")
        private java.util.List < CustomLine> customLine;

        private CustomLines(Builder builder) {
            this.customLine = builder.customLine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomLines create() {
            return builder().build();
        }

        /**
         * @return customLine
         */
        public java.util.List < CustomLine> getCustomLine() {
            return this.customLine;
        }

        public static final class Builder {
            private java.util.List < CustomLine> customLine; 

            /**
             * CustomLine.
             */
            public Builder customLine(java.util.List < CustomLine> customLine) {
                this.customLine = customLine;
                return this;
            }

            public CustomLines build() {
                return new CustomLines(this);
            } 

        } 

    }
}
