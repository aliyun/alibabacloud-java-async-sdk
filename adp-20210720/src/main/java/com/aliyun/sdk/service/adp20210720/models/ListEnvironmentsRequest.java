// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentsRequest} extends {@link RequestModel}
 *
 * <p>ListEnvironmentsRequest</p>
 */
public class ListEnvironmentsRequest extends Request {
    @Query
    @NameInMap("clusterUID")
    private String clusterUID;

    @Query
    @NameInMap("endpoint")
    private String endpoint;

    @Query
    @NameInMap("foundationType")
    private String foundationType;

    @Query
    @NameInMap("fuzzy")
    private String fuzzy;

    @Query
    @NameInMap("instanceStatus")
    private String instanceStatus;

    @Query
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("pageNum")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNum;

    @Query
    @NameInMap("pageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

    @Query
    @NameInMap("type")
    private String type;

    @Query
    @NameInMap("vendorType")
    private String vendorType;

    private ListEnvironmentsRequest(Builder builder) {
        super(builder);
        this.clusterUID = builder.clusterUID;
        this.endpoint = builder.endpoint;
        this.foundationType = builder.foundationType;
        this.fuzzy = builder.fuzzy;
        this.instanceStatus = builder.instanceStatus;
        this.name = builder.name;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.type = builder.type;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterUID
     */
    public String getClusterUID() {
        return this.clusterUID;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return foundationType
     */
    public String getFoundationType() {
        return this.foundationType;
    }

    /**
     * @return fuzzy
     */
    public String getFuzzy() {
        return this.fuzzy;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder extends Request.Builder<ListEnvironmentsRequest, Builder> {
        private String clusterUID; 
        private String endpoint; 
        private String foundationType; 
        private String fuzzy; 
        private String instanceStatus; 
        private String name; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String type; 
        private String vendorType; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvironmentsRequest request) {
            super(request);
            this.clusterUID = request.clusterUID;
            this.endpoint = request.endpoint;
            this.foundationType = request.foundationType;
            this.fuzzy = request.fuzzy;
            this.instanceStatus = request.instanceStatus;
            this.name = request.name;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.type = request.type;
            this.vendorType = request.vendorType;
        } 

        /**
         * clusterUID.
         */
        public Builder clusterUID(String clusterUID) {
            this.putQueryParameter("clusterUID", clusterUID);
            this.clusterUID = clusterUID;
            return this;
        }

        /**
         * endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * foundationType.
         */
        public Builder foundationType(String foundationType) {
            this.putQueryParameter("foundationType", foundationType);
            this.foundationType = foundationType;
            return this;
        }

        /**
         * fuzzy.
         */
        public Builder fuzzy(String fuzzy) {
            this.putQueryParameter("fuzzy", fuzzy);
            this.fuzzy = fuzzy;
            return this;
        }

        /**
         * instanceStatus.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.putQueryParameter("instanceStatus", instanceStatus);
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.putQueryParameter("vendorType", vendorType);
            this.vendorType = vendorType;
            return this;
        }

        @Override
        public ListEnvironmentsRequest build() {
            return new ListEnvironmentsRequest(this);
        } 

    } 

}
