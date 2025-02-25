// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link ListSoftwaresRequest} extends {@link RequestModel}
 *
 * <p>ListSoftwaresRequest</p>
 */
public class ListSoftwaresRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsInfos")
    private java.util.List<OsInfos> osInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    private ListSoftwaresRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.clusterId = builder.clusterId;
        this.name = builder.name;
        this.osInfos = builder.osInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSoftwaresRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return osInfos
     */
    public java.util.List<OsInfos> getOsInfos() {
        return this.osInfos;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListSoftwaresRequest, Builder> {
        private String category; 
        private String clusterId; 
        private String name; 
        private java.util.List<OsInfos> osInfos; 
        private String pageNumber; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListSoftwaresRequest request) {
            super(request);
            this.category = request.category;
            this.clusterId = request.clusterId;
            this.name = request.name;
            this.osInfos = request.osInfos;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The application category.</p>
         * 
         * <strong>example:</strong>
         * <p>NWP</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The software name.</p>
         * 
         * <strong>example:</strong>
         * <p>gromacs</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The operating system (OS) information.</p>
         */
        public Builder osInfos(java.util.List<OsInfos> osInfos) {
            this.putQueryParameter("OsInfos", osInfos);
            this.osInfos = osInfos;
            return this;
        }

        /**
         * <p>The page number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListSoftwaresRequest build() {
            return new ListSoftwaresRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListSoftwaresRequest} extends {@link TeaModel}
     *
     * <p>ListSoftwaresRequest</p>
     */
    public static class OsInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("OsTag")
        private String osTag;

        private OsInfos(Builder builder) {
            this.architecture = builder.architecture;
            this.osTag = builder.osTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OsInfos create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return osTag
         */
        public String getOsTag() {
            return this.osTag;
        }

        public static final class Builder {
            private String architecture; 
            private String osTag; 

            /**
             * <p>The OS architecture. Valid values:</p>
             * <ul>
             * <li>x86_64</li>
             * <li>arm64</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>x86_64</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>The image tag.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.9_64</p>
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            public OsInfos build() {
                return new OsInfos(this);
            } 

        } 

    }
}
