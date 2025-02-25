// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAlertActionsRequest} extends {@link RequestModel}
 *
 * <p>ListAlertActionsRequest</p>
 */
public class ListAlertActionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alertActionIds")
    private java.util.List < String > alertActionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alertActionName")
    private String alertActionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListAlertActionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertActionIds = builder.alertActionIds;
        this.alertActionName = builder.alertActionName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertActionsRequest create() {
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
     * @return alertActionIds
     */
    public java.util.List < String > getAlertActionIds() {
        return this.alertActionIds;
    }

    /**
     * @return alertActionName
     */
    public String getAlertActionName() {
        return this.alertActionName;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListAlertActionsRequest, Builder> {
        private String regionId; 
        private java.util.List < String > alertActionIds; 
        private String alertActionName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertActionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertActionIds = request.alertActionIds;
            this.alertActionName = request.alertActionName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.type = request.type;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * alertActionIds.
         */
        public Builder alertActionIds(java.util.List < String > alertActionIds) {
            String alertActionIdsShrink = shrink(alertActionIds, "alertActionIds", "json");
            this.putQueryParameter("alertActionIds", alertActionIdsShrink);
            this.alertActionIds = alertActionIds;
            return this;
        }

        /**
         * alertActionName.
         */
        public Builder alertActionName(String alertActionName) {
            this.putQueryParameter("alertActionName", alertActionName);
            this.alertActionName = alertActionName;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
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

        @Override
        public ListAlertActionsRequest build() {
            return new ListAlertActionsRequest(this);
        } 

    } 

}
