// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrailsRequest} extends {@link RequestModel}
 *
 * <p>DescribeTrailsRequest</p>
 */
public class DescribeTrailsRequest extends Request {
    @Query
    @NameInMap("IncludeOrganizationTrail")
    private Boolean includeOrganizationTrail;

    @Query
    @NameInMap("IncludeShadowTrails")
    private Boolean includeShadowTrails;

    @Query
    @NameInMap("NameList")
    private String nameList;

    private DescribeTrailsRequest(Builder builder) {
        super(builder);
        this.includeOrganizationTrail = builder.includeOrganizationTrail;
        this.includeShadowTrails = builder.includeShadowTrails;
        this.nameList = builder.nameList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeOrganizationTrail
     */
    public Boolean getIncludeOrganizationTrail() {
        return this.includeOrganizationTrail;
    }

    /**
     * @return includeShadowTrails
     */
    public Boolean getIncludeShadowTrails() {
        return this.includeShadowTrails;
    }

    /**
     * @return nameList
     */
    public String getNameList() {
        return this.nameList;
    }

    public static final class Builder extends Request.Builder<DescribeTrailsRequest, Builder> {
        private Boolean includeOrganizationTrail; 
        private Boolean includeShadowTrails; 
        private String nameList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTrailsRequest request) {
            super(request);
            this.includeOrganizationTrail = request.includeOrganizationTrail;
            this.includeShadowTrails = request.includeShadowTrails;
            this.nameList = request.nameList;
        } 

        /**
         * Specifies whether to query the information about multi-account trails. Valid values:
         * <p>
         * 
         * *   true
         * *   false (default)
         */
        public Builder includeOrganizationTrail(Boolean includeOrganizationTrail) {
            this.putQueryParameter("IncludeOrganizationTrail", includeOrganizationTrail);
            this.includeOrganizationTrail = includeOrganizationTrail;
            return this;
        }

        /**
         * Specifies whether to return the information about shadow trails. Valid values:
         * <p>
         * 
         * *   false: Do not return the information about shadow trails. It is the default value.
         * *   true: Return the information about shadow trails.
         */
        public Builder includeShadowTrails(Boolean includeShadowTrails) {
            this.putQueryParameter("IncludeShadowTrails", includeShadowTrails);
            this.includeShadowTrails = includeShadowTrails;
            return this;
        }

        /**
         * The names of the trails whose information you want to query. Separate multiple trail names with commas (,).
         */
        public Builder nameList(String nameList) {
            this.putQueryParameter("NameList", nameList);
            this.nameList = nameList;
            return this;
        }

        @Override
        public DescribeTrailsRequest build() {
            return new DescribeTrailsRequest(this);
        } 

    } 

}
