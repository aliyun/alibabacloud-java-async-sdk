// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWebHostingFilesRequest} extends {@link RequestModel}
 *
 * <p>ListWebHostingFilesRequest</p>
 */
public class ListWebHostingFilesRequest extends Request {
    @Body
    @NameInMap("Marker")
    private String marker;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("Prefix")
    @Validation(required = true)
    private String prefix;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private ListWebHostingFilesRequest(Builder builder) {
        super(builder);
        this.marker = builder.marker;
        this.pageSize = builder.pageSize;
        this.prefix = builder.prefix;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebHostingFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<ListWebHostingFilesRequest, Builder> {
        private String marker; 
        private Integer pageSize; 
        private String prefix; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListWebHostingFilesRequest request) {
            super(request);
            this.marker = request.marker;
            this.pageSize = request.pageSize;
            this.prefix = request.prefix;
            this.spaceId = request.spaceId;
        } 

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.putBodyParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.putBodyParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public ListWebHostingFilesRequest build() {
            return new ListWebHostingFilesRequest(this);
        } 

    } 

}
