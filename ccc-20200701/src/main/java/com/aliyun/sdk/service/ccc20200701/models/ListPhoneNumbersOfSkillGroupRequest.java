// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPhoneNumbersOfSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>ListPhoneNumbersOfSkillGroupRequest</p>
 */
public class ListPhoneNumbersOfSkillGroupRequest extends Request {
    @Query
    @NameInMap("Active")
    private Boolean active;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IsMember")
    @Validation(required = true)
    private Boolean isMember;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("SearchPattern")
    private String searchPattern;

    @Query
    @NameInMap("SkillGroupId")
    @Validation(required = true)
    private String skillGroupId;

    private ListPhoneNumbersOfSkillGroupRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.instanceId = builder.instanceId;
        this.isMember = builder.isMember;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchPattern = builder.searchPattern;
        this.skillGroupId = builder.skillGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPhoneNumbersOfSkillGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isMember
     */
    public Boolean getIsMember() {
        return this.isMember;
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
     * @return searchPattern
     */
    public String getSearchPattern() {
        return this.searchPattern;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public static final class Builder extends Request.Builder<ListPhoneNumbersOfSkillGroupRequest, Builder> {
        private Boolean active; 
        private String instanceId; 
        private Boolean isMember; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchPattern; 
        private String skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListPhoneNumbersOfSkillGroupRequest request) {
            super(request);
            this.active = request.active;
            this.instanceId = request.instanceId;
            this.isMember = request.isMember;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchPattern = request.searchPattern;
            this.skillGroupId = request.skillGroupId;
        } 

        /**
         * Active.
         */
        public Builder active(Boolean active) {
            this.putQueryParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsMember.
         */
        public Builder isMember(Boolean isMember) {
            this.putQueryParameter("IsMember", isMember);
            this.isMember = isMember;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchPattern.
         */
        public Builder searchPattern(String searchPattern) {
            this.putQueryParameter("SearchPattern", searchPattern);
            this.searchPattern = searchPattern;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        @Override
        public ListPhoneNumbersOfSkillGroupRequest build() {
            return new ListPhoneNumbersOfSkillGroupRequest(this);
        } 

    } 

}
