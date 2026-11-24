// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListVirusScanAdditionalListsRequest} extends {@link RequestModel}
 *
 * <p>ListVirusScanAdditionalListsRequest</p>
 */
public class ListVirusScanAdditionalListsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalTypes")
    private java.util.List<String> additionalTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DevType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String devType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListDetail")
    private String listDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListIds")
    private java.util.List<String> listIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListType")
    private String listType;

    private ListVirusScanAdditionalListsRequest(Builder builder) {
        super(builder);
        this.additionalTypes = builder.additionalTypes;
        this.devType = builder.devType;
        this.listDetail = builder.listDetail;
        this.listIds = builder.listIds;
        this.listType = builder.listType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanAdditionalListsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalTypes
     */
    public java.util.List<String> getAdditionalTypes() {
        return this.additionalTypes;
    }

    /**
     * @return devType
     */
    public String getDevType() {
        return this.devType;
    }

    /**
     * @return listDetail
     */
    public String getListDetail() {
        return this.listDetail;
    }

    /**
     * @return listIds
     */
    public java.util.List<String> getListIds() {
        return this.listIds;
    }

    /**
     * @return listType
     */
    public String getListType() {
        return this.listType;
    }

    public static final class Builder extends Request.Builder<ListVirusScanAdditionalListsRequest, Builder> {
        private java.util.List<String> additionalTypes; 
        private String devType; 
        private String listDetail; 
        private java.util.List<String> listIds; 
        private String listType; 

        private Builder() {
            super();
        } 

        private Builder(ListVirusScanAdditionalListsRequest request) {
            super(request);
            this.additionalTypes = request.additionalTypes;
            this.devType = request.devType;
            this.listDetail = request.listDetail;
            this.listIds = request.listIds;
            this.listType = request.listType;
        } 

        /**
         * <p>Filters by match dimension. Duplicate values are not allowed. If this parameter is not specified, all match dimensions are returned.</p>
         */
        public Builder additionalTypes(java.util.List<String> additionalTypes) {
            this.putQueryParameter("AdditionalTypes", additionalTypes);
            this.additionalTypes = additionalTypes;
            return this;
        }

        /**
         * <p>The operating system type for which the list takes effect. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows.</li>
         * <li><strong>macOS</strong>: macOS.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        public Builder devType(String devType) {
            this.putQueryParameter("DevType", devType);
            this.devType = devType;
            return this;
        }

        /**
         * <p>The content of the list entry. Exact match is used. This parameter is used to locate a specific list by content. Fuzzy match is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>.tmp</p>
         */
        public Builder listDetail(String listDetail) {
            this.putQueryParameter("ListDetail", listDetail);
            this.listDetail = listDetail;
            return this;
        }

        /**
         * <p>Filters by list entry ID. Duplicate values are not allowed. If this parameter is not specified, no filtering by list entry ID is performed.</p>
         */
        public Builder listIds(java.util.List<String> listIds) {
            this.putQueryParameter("ListIds", listIds);
            this.listIds = listIds;
            return this;
        }

        /**
         * <p>Filters by list type. If this parameter is not specified, both blacklists and whitelists are returned. Valid values:</p>
         * <ul>
         * <li><strong>Blacklist</strong>: Blacklist. Matched files are directly identified as virus files.</li>
         * <li><strong>Whitelist</strong>: Whitelist. Matched files are excluded from virus detection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Whitelist</p>
         */
        public Builder listType(String listType) {
            this.putQueryParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        @Override
        public ListVirusScanAdditionalListsRequest build() {
            return new ListVirusScanAdditionalListsRequest(this);
        } 

    } 

}
