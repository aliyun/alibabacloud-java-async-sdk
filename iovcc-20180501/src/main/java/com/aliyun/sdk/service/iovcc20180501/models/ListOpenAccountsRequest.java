// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOpenAccountsRequest} extends {@link RequestModel}
 *
 * <p>ListOpenAccountsRequest</p>
 */
public class ListOpenAccountsRequest extends Request {
    @Query
    @NameInMap("DisplayName")
    private String displayName;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("Length")
    private Integer length;

    @Query
    @NameInMap("Mobile")
    private String mobile;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Start")
    private Integer start;

    private ListOpenAccountsRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.length = builder.length;
        this.mobile = builder.mobile;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpenAccountsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return start
     */
    public Integer getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<ListOpenAccountsRequest, Builder> {
        private String displayName; 
        private String email; 
        private Integer length; 
        private String mobile; 
        private String projectId; 
        private String regionId; 
        private Integer start; 

        private Builder() {
            super();
        } 

        private Builder(ListOpenAccountsRequest response) {
            super(response);
            this.displayName = response.displayName;
            this.email = response.email;
            this.length = response.length;
            this.mobile = response.mobile;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.start = response.start;
        } 

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Length.
         */
        public Builder length(Integer length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
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
         * Start.
         */
        public Builder start(Integer start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public ListOpenAccountsRequest build() {
            return new ListOpenAccountsRequest(this);
        } 

    } 

}
