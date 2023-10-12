// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPhysicalSpacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPhysicalSpacesResponseBody</p>
 */
public class ListPhysicalSpacesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("PhysicalSpaces")
    private java.util.List < PhysicalSpaces> physicalSpaces;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListPhysicalSpacesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.physicalSpaces = builder.physicalSpaces;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPhysicalSpacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
        return this.nextToken;
    }

    /**
     * @return physicalSpaces
     */
    public java.util.List < PhysicalSpaces> getPhysicalSpaces() {
        return this.physicalSpaces;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private Integer nextToken; 
        private java.util.List < PhysicalSpaces> physicalSpaces; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PhysicalSpaces.
         */
        public Builder physicalSpaces(java.util.List < PhysicalSpaces> physicalSpaces) {
            this.physicalSpaces = physicalSpaces;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPhysicalSpacesResponseBody build() {
            return new ListPhysicalSpacesResponseBody(this);
        } 

    } 

    public static class PhysicalSpaces extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("City")
        private String city;

        @NameInMap("Country")
        private String country;

        @NameInMap("Instance")
        private String instance;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("PhysicalSpaceId")
        private String physicalSpaceId;

        @NameInMap("PhysicalSpaceName")
        private String physicalSpaceName;

        @NameInMap("Province")
        private String province;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("SecurityDomainList")
        private java.util.List < String > securityDomainList;

        @NameInMap("SpaceAbbreviation")
        private String spaceAbbreviation;

        @NameInMap("SpaceType")
        private String spaceType;

        private PhysicalSpaces(Builder builder) {
            this.address = builder.address;
            this.city = builder.city;
            this.country = builder.country;
            this.instance = builder.instance;
            this.owner = builder.owner;
            this.physicalSpaceId = builder.physicalSpaceId;
            this.physicalSpaceName = builder.physicalSpaceName;
            this.province = builder.province;
            this.remark = builder.remark;
            this.securityDomainList = builder.securityDomainList;
            this.spaceAbbreviation = builder.spaceAbbreviation;
            this.spaceType = builder.spaceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhysicalSpaces create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return physicalSpaceId
         */
        public String getPhysicalSpaceId() {
            return this.physicalSpaceId;
        }

        /**
         * @return physicalSpaceName
         */
        public String getPhysicalSpaceName() {
            return this.physicalSpaceName;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return securityDomainList
         */
        public java.util.List < String > getSecurityDomainList() {
            return this.securityDomainList;
        }

        /**
         * @return spaceAbbreviation
         */
        public String getSpaceAbbreviation() {
            return this.spaceAbbreviation;
        }

        /**
         * @return spaceType
         */
        public String getSpaceType() {
            return this.spaceType;
        }

        public static final class Builder {
            private String address; 
            private String city; 
            private String country; 
            private String instance; 
            private String owner; 
            private String physicalSpaceId; 
            private String physicalSpaceName; 
            private String province; 
            private String remark; 
            private java.util.List < String > securityDomainList; 
            private String spaceAbbreviation; 
            private String spaceType; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * Instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * PhysicalSpaceId.
             */
            public Builder physicalSpaceId(String physicalSpaceId) {
                this.physicalSpaceId = physicalSpaceId;
                return this;
            }

            /**
             * PhysicalSpaceName.
             */
            public Builder physicalSpaceName(String physicalSpaceName) {
                this.physicalSpaceName = physicalSpaceName;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SecurityDomainList.
             */
            public Builder securityDomainList(java.util.List < String > securityDomainList) {
                this.securityDomainList = securityDomainList;
                return this;
            }

            /**
             * SpaceAbbreviation.
             */
            public Builder spaceAbbreviation(String spaceAbbreviation) {
                this.spaceAbbreviation = spaceAbbreviation;
                return this;
            }

            /**
             * SpaceType.
             */
            public Builder spaceType(String spaceType) {
                this.spaceType = spaceType;
                return this;
            }

            public PhysicalSpaces build() {
                return new PhysicalSpaces(this);
            } 

        } 

    }
}
