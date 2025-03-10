// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link ListRecyclebinRequest} extends {@link RequestModel}
 *
 * <p>ListRecyclebinRequest</p>
 */
public class ListRecyclebinRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fields")
    private String fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("thumbnail_processes")
    private java.util.Map<String, ImageProcess> thumbnailProcesses;

    private ListRecyclebinRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fields = builder.fields;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.thumbnailProcesses = builder.thumbnailProcesses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecyclebinRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return thumbnailProcesses
     */
    public java.util.Map<String, ImageProcess> getThumbnailProcesses() {
        return this.thumbnailProcesses;
    }

    public static final class Builder extends Request.Builder<ListRecyclebinRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fields; 
        private Integer limit; 
        private String marker; 
        private java.util.Map<String, ImageProcess> thumbnailProcesses; 

        private Builder() {
            super();
        } 

        private Builder(ListRecyclebinRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fields = request.fields;
            this.limit = request.limit;
            this.marker = request.marker;
            this.thumbnailProcesses = request.thumbnailProcesses;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The drive ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>Specifies the returned fields.</p>
         * <p>1. If you set this parameter to *, all fields of the file are returned.</p>
         * <p>2. If you set this parameter to a null value or leave this parameter empty, the fields, such as file creator, file modifier, and custom tags, are not returned.</p>
         * <p>The default value is a null value, which indicates that only some fields are returned.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder fields(String fields) {
            this.putBodyParameter("fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * <p>The maximum number of results to return. Valid values: 1 to 200. Default value: 50.</p>
         * <p>The number of returned results must be less than or equal to the specified number.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker. By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * thumbnail_processes.
         */
        public Builder thumbnailProcesses(java.util.Map<String, ImageProcess> thumbnailProcesses) {
            this.putBodyParameter("thumbnail_processes", thumbnailProcesses);
            this.thumbnailProcesses = thumbnailProcesses;
            return this;
        }

        @Override
        public ListRecyclebinRequest build() {
            return new ListRecyclebinRequest(this);
        } 

    } 

}
