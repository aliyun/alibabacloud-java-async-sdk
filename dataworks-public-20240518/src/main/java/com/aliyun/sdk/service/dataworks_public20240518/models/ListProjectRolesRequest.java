// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListProjectRolesRequest} extends {@link RequestModel}
 *
 * <p>ListProjectRolesRequest</p>
 */
public class ListProjectRolesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Codes")
    private java.util.List < String > codes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Names")
    private java.util.List < String > names;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListProjectRolesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.codes = builder.codes;
        this.names = builder.names;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectRolesRequest create() {
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
     * @return codes
     */
    public java.util.List < String > getCodes() {
        return this.codes;
    }

    /**
     * @return names
     */
    public java.util.List < String > getNames() {
        return this.names;
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListProjectRolesRequest, Builder> {
        private String regionId; 
        private java.util.List < String > codes; 
        private java.util.List < String > names; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectRolesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.codes = request.codes;
            this.names = request.names;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Codes.
         */
        public Builder codes(java.util.List < String > codes) {
            String codesShrink = shrink(codes, "Codes", "json");
            this.putBodyParameter("Codes", codesShrink);
            this.codes = codes;
            return this;
        }

        /**
         * Names.
         */
        public Builder names(java.util.List < String > names) {
            String namesShrink = shrink(names, "Names", "json");
            this.putBodyParameter("Names", namesShrink);
            this.names = names;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21229</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListProjectRolesRequest build() {
            return new ListProjectRolesRequest(this);
        } 

    } 

}
