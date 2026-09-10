// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarFsRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarFsRequest</p>
 */
public class DescribePolarFsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceDescription")
    private String polarFsInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceIds")
    private String polarFsInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsType")
    private String polarFsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelativeDbClusterId")
    private String relativeDbClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private DescribePolarFsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.polarFsInstanceDescription = builder.polarFsInstanceDescription;
        this.polarFsInstanceIds = builder.polarFsInstanceIds;
        this.polarFsType = builder.polarFsType;
        this.regionId = builder.regionId;
        this.relativeDbClusterId = builder.relativeDbClusterId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarFsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
     * @return polarFsInstanceDescription
     */
    public String getPolarFsInstanceDescription() {
        return this.polarFsInstanceDescription;
    }

    /**
     * @return polarFsInstanceIds
     */
    public String getPolarFsInstanceIds() {
        return this.polarFsInstanceIds;
    }

    /**
     * @return polarFsType
     */
    public String getPolarFsType() {
        return this.polarFsType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return relativeDbClusterId
     */
    public String getRelativeDbClusterId() {
        return this.relativeDbClusterId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribePolarFsRequest, Builder> {
        private String DBClusterId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String polarFsInstanceDescription; 
        private String polarFsInstanceIds; 
        private String polarFsType; 
        private String regionId; 
        private String relativeDbClusterId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarFsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.polarFsInstanceDescription = request.polarFsInstanceDescription;
            this.polarFsInstanceIds = request.polarFsInstanceIds;
            this.polarFsType = request.polarFsType;
            this.regionId = request.regionId;
            this.relativeDbClusterId = request.relativeDbClusterId;
            this.tag = request.tag;
        } 

        /**
         * <p>The instance ID of the PolarDB instance on which the application depends.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze8u21s03******</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The page number. The value must be an integer greater than 0 and not exceeding the maximum value of Integer.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><p><strong>30</strong></p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The description of the PolarFS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-ins1********</p>
         */
        public Builder polarFsInstanceDescription(String polarFsInstanceDescription) {
            this.putQueryParameter("PolarFsInstanceDescription", polarFsInstanceDescription);
            this.polarFsInstanceDescription = polarFsInstanceDescription;
            return this;
        }

        /**
         * <p>The list of PolarFS instance IDs, separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-ins1*******</p>
         */
        public Builder polarFsInstanceIds(String polarFsInstanceIds) {
            this.putQueryParameter("PolarFsInstanceIds", polarFsInstanceIds);
            this.polarFsInstanceIds = polarFsInstanceIds;
            return this;
        }

        /**
         * <p>The PolarFS type.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder polarFsType(String polarFsType) {
            this.putQueryParameter("PolarFsType", polarFsType);
            this.polarFsType = polarFsType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the associated PolarDB cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2zejpr41d9xk*****</p>
         */
        public Builder relativeDbClusterId(String relativeDbClusterId) {
            this.putQueryParameter("RelativeDbClusterId", relativeDbClusterId);
            this.relativeDbClusterId = relativeDbClusterId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribePolarFsRequest build() {
            return new DescribePolarFsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarFsRequest} extends {@link TeaModel}
     *
     * <p>DescribePolarFsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
