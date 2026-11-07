// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ListNacosMcpServersResponseBody} extends {@link TeaModel}
 *
 * <p>ListNacosMcpServersResponseBody</p>
 */
public class ListNacosMcpServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListNacosMcpServersResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNacosMcpServersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListNacosMcpServersResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data structure.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ADDD8AB7-8D1C-4697-A83E-410D2607****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNacosMcpServersResponseBody build() {
            return new ListNacosMcpServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNacosMcpServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListNacosMcpServersResponseBody</p>
     */
    public static class VersionDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Is_latest")
        private Boolean isLatest;

        @com.aliyun.core.annotation.NameInMap("Release_date")
        private String releaseDate;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private VersionDetail(Builder builder) {
            this.isLatest = builder.isLatest;
            this.releaseDate = builder.releaseDate;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionDetail create() {
            return builder().build();
        }

        /**
         * @return isLatest
         */
        public Boolean getIsLatest() {
            return this.isLatest;
        }

        /**
         * @return releaseDate
         */
        public String getReleaseDate() {
            return this.releaseDate;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean isLatest; 
            private String releaseDate; 
            private String version; 

            private Builder() {
            } 

            private Builder(VersionDetail model) {
                this.isLatest = model.isLatest;
                this.releaseDate = model.releaseDate;
                this.version = model.version;
            } 

            /**
             * <p>Indicates whether this is the latest version.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isLatest(Boolean isLatest) {
                this.isLatest = isLatest;
                return this;
            }

            /**
             * <p>The release date.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-16</p>
             */
            public Builder releaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public VersionDetail build() {
                return new VersionDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNacosMcpServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListNacosMcpServersResponseBody</p>
     */
    public static class PageItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capabilities")
        private java.util.List<String> capabilities;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FrontProtocol")
        private String frontProtocol;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionDetail")
        private VersionDetail versionDetail;

        private PageItems(Builder builder) {
            this.capabilities = builder.capabilities;
            this.description = builder.description;
            this.frontProtocol = builder.frontProtocol;
            this.id = builder.id;
            this.name = builder.name;
            this.protocol = builder.protocol;
            this.version = builder.version;
            this.versionDetail = builder.versionDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageItems create() {
            return builder().build();
        }

        /**
         * @return capabilities
         */
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return frontProtocol
         */
        public String getFrontProtocol() {
            return this.frontProtocol;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionDetail
         */
        public VersionDetail getVersionDetail() {
            return this.versionDetail;
        }

        public static final class Builder {
            private java.util.List<String> capabilities; 
            private String description; 
            private String frontProtocol; 
            private String id; 
            private String name; 
            private String protocol; 
            private String version; 
            private VersionDetail versionDetail; 

            private Builder() {
            } 

            private Builder(PageItems model) {
                this.capabilities = model.capabilities;
                this.description = model.description;
                this.frontProtocol = model.frontProtocol;
                this.id = model.id;
                this.name = model.name;
                this.protocol = model.protocol;
                this.version = model.version;
                this.versionDetail = model.versionDetail;
            } 

            /**
             * <p>The capabilities of the MCP server.</p>
             */
            public Builder capabilities(java.util.List<String> capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The frontend protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-sse</p>
             */
            public Builder frontProtocol(String frontProtocol) {
                this.frontProtocol = frontProtocol;
                return this;
            }

            /**
             * <p>ID。</p>
             * 
             * <strong>example:</strong>
             * <p>2385420b-6176-4a37-aba4-d3d382e4bb84</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the MCP server.</p>
             * 
             * <strong>example:</strong>
             * <p>stdio</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The current latest version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The version details.</p>
             */
            public Builder versionDetail(VersionDetail versionDetail) {
                this.versionDetail = versionDetail;
                return this;
            }

            public PageItems build() {
                return new PageItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNacosMcpServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListNacosMcpServersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageItems")
        private java.util.List<PageItems> pageItems;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PagesAvailable")
        private Integer pagesAvailable;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.pageItems = builder.pageItems;
            this.pageNumber = builder.pageNumber;
            this.pagesAvailable = builder.pagesAvailable;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageItems
         */
        public java.util.List<PageItems> getPageItems() {
            return this.pageItems;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pagesAvailable
         */
        public Integer getPagesAvailable() {
            return this.pagesAvailable;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<PageItems> pageItems; 
            private Integer pageNumber; 
            private Integer pagesAvailable; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageItems = model.pageItems;
                this.pageNumber = model.pageNumber;
                this.pagesAvailable = model.pagesAvailable;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The paginated list of MCP servers.</p>
             */
            public Builder pageItems(java.util.List<PageItems> pageItems) {
                this.pageItems = pageItems;
                return this;
            }

            /**
             * <p>pageNumber.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>pagesAvailable.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pagesAvailable(Integer pagesAvailable) {
                this.pagesAvailable = pagesAvailable;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
