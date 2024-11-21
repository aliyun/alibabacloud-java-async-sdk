// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>ListAlertRulesRequest</p>
 */
public class ListAlertRulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Receiver")
    private String receiver;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List < Long > taskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private java.util.List < String > types;

    private ListAlertRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.name = builder.name;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.receiver = builder.receiver;
        this.taskIds = builder.taskIds;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
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
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return receiver
     */
    public String getReceiver() {
        return this.receiver;
    }

    /**
     * @return taskIds
     */
    public java.util.List < Long > getTaskIds() {
        return this.taskIds;
    }

    /**
     * @return types
     */
    public java.util.List < String > getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<ListAlertRulesRequest, Builder> {
        private String regionId; 
        private String name; 
        private String owner; 
        private Integer pageNumber; 
        private Long pageSize; 
        private String receiver; 
        private java.util.List < Long > taskIds; 
        private java.util.List < String > types; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertRulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.name = request.name;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.receiver = request.receiver;
            this.taskIds = request.taskIds;
            this.types = request.types;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Receiver.
         */
        public Builder receiver(String receiver) {
            this.putQueryParameter("Receiver", receiver);
            this.receiver = receiver;
            return this;
        }

        /**
         * TaskIds.
         */
        public Builder taskIds(java.util.List < Long > taskIds) {
            String taskIdsShrink = shrink(taskIds, "TaskIds", "json");
            this.putQueryParameter("TaskIds", taskIdsShrink);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * Types.
         */
        public Builder types(java.util.List < String > types) {
            String typesShrink = shrink(types, "Types", "json");
            this.putQueryParameter("Types", typesShrink);
            this.types = types;
            return this;
        }

        @Override
        public ListAlertRulesRequest build() {
            return new ListAlertRulesRequest(this);
        } 

    } 

}
