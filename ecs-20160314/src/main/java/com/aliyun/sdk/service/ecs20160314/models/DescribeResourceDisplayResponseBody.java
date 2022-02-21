// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceDisplayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceDisplayResponseBody</p>
 */
public class DescribeResourceDisplayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceDisplay")
    private ResourceDisplay resourceDisplay;

    private DescribeResourceDisplayResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceDisplay = builder.resourceDisplay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceDisplayResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceDisplay
     */
    public ResourceDisplay getResourceDisplay() {
        return this.resourceDisplay;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceDisplay resourceDisplay; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceDisplay.
         */
        public Builder resourceDisplay(ResourceDisplay resourceDisplay) {
            this.resourceDisplay = resourceDisplay;
            return this;
        }

        public DescribeResourceDisplayResponseBody build() {
            return new DescribeResourceDisplayResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < String > tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < String > getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < String > tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < String > tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class InstanceTypeFamily extends TeaModel {
        @NameInMap("InstanceTypeFamilyId")
        private String instanceTypeFamilyId;

        @NameInMap("Tags")
        private Tags tags;

        private InstanceTypeFamily(Builder builder) {
            this.instanceTypeFamilyId = builder.instanceTypeFamilyId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeFamily create() {
            return builder().build();
        }

        /**
         * @return instanceTypeFamilyId
         */
        public String getInstanceTypeFamilyId() {
            return this.instanceTypeFamilyId;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String instanceTypeFamilyId; 
            private Tags tags; 

            /**
             * InstanceTypeFamilyId.
             */
            public Builder instanceTypeFamilyId(String instanceTypeFamilyId) {
                this.instanceTypeFamilyId = instanceTypeFamilyId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public InstanceTypeFamily build() {
                return new InstanceTypeFamily(this);
            } 

        } 

    }
    public static class InstanceTypeFamilies extends TeaModel {
        @NameInMap("InstanceTypeFamily")
        private java.util.List < InstanceTypeFamily> instanceTypeFamily;

        private InstanceTypeFamilies(Builder builder) {
            this.instanceTypeFamily = builder.instanceTypeFamily;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeFamilies create() {
            return builder().build();
        }

        /**
         * @return instanceTypeFamily
         */
        public java.util.List < InstanceTypeFamily> getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public static final class Builder {
            private java.util.List < InstanceTypeFamily> instanceTypeFamily; 

            /**
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(java.util.List < InstanceTypeFamily> instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            public InstanceTypeFamilies build() {
                return new InstanceTypeFamilies(this);
            } 

        } 

    }
    public static class InstanceSecondCategory extends TeaModel {
        @NameInMap("InstanceTypeFamilies")
        private InstanceTypeFamilies instanceTypeFamilies;

        @NameInMap("SecondCategoryLevel")
        private String secondCategoryLevel;

        private InstanceSecondCategory(Builder builder) {
            this.instanceTypeFamilies = builder.instanceTypeFamilies;
            this.secondCategoryLevel = builder.secondCategoryLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSecondCategory create() {
            return builder().build();
        }

        /**
         * @return instanceTypeFamilies
         */
        public InstanceTypeFamilies getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

        /**
         * @return secondCategoryLevel
         */
        public String getSecondCategoryLevel() {
            return this.secondCategoryLevel;
        }

        public static final class Builder {
            private InstanceTypeFamilies instanceTypeFamilies; 
            private String secondCategoryLevel; 

            /**
             * InstanceTypeFamilies.
             */
            public Builder instanceTypeFamilies(InstanceTypeFamilies instanceTypeFamilies) {
                this.instanceTypeFamilies = instanceTypeFamilies;
                return this;
            }

            /**
             * SecondCategoryLevel.
             */
            public Builder secondCategoryLevel(String secondCategoryLevel) {
                this.secondCategoryLevel = secondCategoryLevel;
                return this;
            }

            public InstanceSecondCategory build() {
                return new InstanceSecondCategory(this);
            } 

        } 

    }
    public static class InstanceSecondCategories extends TeaModel {
        @NameInMap("InstanceSecondCategory")
        private java.util.List < InstanceSecondCategory> instanceSecondCategory;

        private InstanceSecondCategories(Builder builder) {
            this.instanceSecondCategory = builder.instanceSecondCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSecondCategories create() {
            return builder().build();
        }

        /**
         * @return instanceSecondCategory
         */
        public java.util.List < InstanceSecondCategory> getInstanceSecondCategory() {
            return this.instanceSecondCategory;
        }

        public static final class Builder {
            private java.util.List < InstanceSecondCategory> instanceSecondCategory; 

            /**
             * InstanceSecondCategory.
             */
            public Builder instanceSecondCategory(java.util.List < InstanceSecondCategory> instanceSecondCategory) {
                this.instanceSecondCategory = instanceSecondCategory;
                return this;
            }

            public InstanceSecondCategories build() {
                return new InstanceSecondCategories(this);
            } 

        } 

    }
    public static class InstanceTopCategory extends TeaModel {
        @NameInMap("InstanceSecondCategories")
        private InstanceSecondCategories instanceSecondCategories;

        @NameInMap("TopCategoryLevel")
        private String topCategoryLevel;

        private InstanceTopCategory(Builder builder) {
            this.instanceSecondCategories = builder.instanceSecondCategories;
            this.topCategoryLevel = builder.topCategoryLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTopCategory create() {
            return builder().build();
        }

        /**
         * @return instanceSecondCategories
         */
        public InstanceSecondCategories getInstanceSecondCategories() {
            return this.instanceSecondCategories;
        }

        /**
         * @return topCategoryLevel
         */
        public String getTopCategoryLevel() {
            return this.topCategoryLevel;
        }

        public static final class Builder {
            private InstanceSecondCategories instanceSecondCategories; 
            private String topCategoryLevel; 

            /**
             * InstanceSecondCategories.
             */
            public Builder instanceSecondCategories(InstanceSecondCategories instanceSecondCategories) {
                this.instanceSecondCategories = instanceSecondCategories;
                return this;
            }

            /**
             * TopCategoryLevel.
             */
            public Builder topCategoryLevel(String topCategoryLevel) {
                this.topCategoryLevel = topCategoryLevel;
                return this;
            }

            public InstanceTopCategory build() {
                return new InstanceTopCategory(this);
            } 

        } 

    }
    public static class InstanceTopCategories extends TeaModel {
        @NameInMap("InstanceTopCategory")
        private java.util.List < InstanceTopCategory> instanceTopCategory;

        private InstanceTopCategories(Builder builder) {
            this.instanceTopCategory = builder.instanceTopCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTopCategories create() {
            return builder().build();
        }

        /**
         * @return instanceTopCategory
         */
        public java.util.List < InstanceTopCategory> getInstanceTopCategory() {
            return this.instanceTopCategory;
        }

        public static final class Builder {
            private java.util.List < InstanceTopCategory> instanceTopCategory; 

            /**
             * InstanceTopCategory.
             */
            public Builder instanceTopCategory(java.util.List < InstanceTopCategory> instanceTopCategory) {
                this.instanceTopCategory = instanceTopCategory;
                return this;
            }

            public InstanceTopCategories build() {
                return new InstanceTopCategories(this);
            } 

        } 

    }
    public static class ZoneIds extends TeaModel {
        @NameInMap("ZoneId")
        private java.util.List < String > zoneId;

        private ZoneIds(Builder builder) {
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneIds create() {
            return builder().build();
        }

        /**
         * @return zoneId
         */
        public java.util.List < String > getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List < String > zoneId; 

            /**
             * ZoneId.
             */
            public Builder zoneId(java.util.List < String > zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneIds build() {
                return new ZoneIds(this);
            } 

        } 

    }
    public static class InstanceCategory extends TeaModel {
        @NameInMap("CategoryType")
        private String categoryType;

        @NameInMap("InstanceTopCategories")
        private InstanceTopCategories instanceTopCategories;

        @NameInMap("ZoneIds")
        private ZoneIds zoneIds;

        private InstanceCategory(Builder builder) {
            this.categoryType = builder.categoryType;
            this.instanceTopCategories = builder.instanceTopCategories;
            this.zoneIds = builder.zoneIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceCategory create() {
            return builder().build();
        }

        /**
         * @return categoryType
         */
        public String getCategoryType() {
            return this.categoryType;
        }

        /**
         * @return instanceTopCategories
         */
        public InstanceTopCategories getInstanceTopCategories() {
            return this.instanceTopCategories;
        }

        /**
         * @return zoneIds
         */
        public ZoneIds getZoneIds() {
            return this.zoneIds;
        }

        public static final class Builder {
            private String categoryType; 
            private InstanceTopCategories instanceTopCategories; 
            private ZoneIds zoneIds; 

            /**
             * CategoryType.
             */
            public Builder categoryType(String categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * InstanceTopCategories.
             */
            public Builder instanceTopCategories(InstanceTopCategories instanceTopCategories) {
                this.instanceTopCategories = instanceTopCategories;
                return this;
            }

            /**
             * ZoneIds.
             */
            public Builder zoneIds(ZoneIds zoneIds) {
                this.zoneIds = zoneIds;
                return this;
            }

            public InstanceCategory build() {
                return new InstanceCategory(this);
            } 

        } 

    }
    public static class InstanceCategories extends TeaModel {
        @NameInMap("InstanceCategory")
        private java.util.List < InstanceCategory> instanceCategory;

        private InstanceCategories(Builder builder) {
            this.instanceCategory = builder.instanceCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceCategories create() {
            return builder().build();
        }

        /**
         * @return instanceCategory
         */
        public java.util.List < InstanceCategory> getInstanceCategory() {
            return this.instanceCategory;
        }

        public static final class Builder {
            private java.util.List < InstanceCategory> instanceCategory; 

            /**
             * InstanceCategory.
             */
            public Builder instanceCategory(java.util.List < InstanceCategory> instanceCategory) {
                this.instanceCategory = instanceCategory;
                return this;
            }

            public InstanceCategories build() {
                return new InstanceCategories(this);
            } 

        } 

    }
    public static class InstanceChargeTypeTags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < String > tag;

        private InstanceChargeTypeTags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceChargeTypeTags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < String > getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < String > tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < String > tag) {
                this.tag = tag;
                return this;
            }

            public InstanceChargeTypeTags build() {
                return new InstanceChargeTypeTags(this);
            } 

        } 

    }
    public static class InstanceChargeType extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("Tags")
        private InstanceChargeTypeTags tags;

        private InstanceChargeType(Builder builder) {
            this.chargeType = builder.chargeType;
            this.spotStrategy = builder.spotStrategy;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceChargeType create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return tags
         */
        public InstanceChargeTypeTags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String chargeType; 
            private String spotStrategy; 
            private InstanceChargeTypeTags tags; 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(InstanceChargeTypeTags tags) {
                this.tags = tags;
                return this;
            }

            public InstanceChargeType build() {
                return new InstanceChargeType(this);
            } 

        } 

    }
    public static class InstanceChargeTypes extends TeaModel {
        @NameInMap("InstanceChargeType")
        private java.util.List < InstanceChargeType> instanceChargeType;

        private InstanceChargeTypes(Builder builder) {
            this.instanceChargeType = builder.instanceChargeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceChargeTypes create() {
            return builder().build();
        }

        /**
         * @return instanceChargeType
         */
        public java.util.List < InstanceChargeType> getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public static final class Builder {
            private java.util.List < InstanceChargeType> instanceChargeType; 

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(java.util.List < InstanceChargeType> instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            public InstanceChargeTypes build() {
                return new InstanceChargeTypes(this);
            } 

        } 

    }
    public static class InstanceTypeFamilyTags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < String > tag;

        private InstanceTypeFamilyTags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeFamilyTags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < String > getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < String > tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < String > tag) {
                this.tag = tag;
                return this;
            }

            public InstanceTypeFamilyTags build() {
                return new InstanceTypeFamilyTags(this);
            } 

        } 

    }
    public static class InstanceTypeFamiliesInstanceTypeFamily extends TeaModel {
        @NameInMap("InstanceTypeFamilyId")
        private String instanceTypeFamilyId;

        @NameInMap("Tags")
        private InstanceTypeFamilyTags tags;

        private InstanceTypeFamiliesInstanceTypeFamily(Builder builder) {
            this.instanceTypeFamilyId = builder.instanceTypeFamilyId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeFamiliesInstanceTypeFamily create() {
            return builder().build();
        }

        /**
         * @return instanceTypeFamilyId
         */
        public String getInstanceTypeFamilyId() {
            return this.instanceTypeFamilyId;
        }

        /**
         * @return tags
         */
        public InstanceTypeFamilyTags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String instanceTypeFamilyId; 
            private InstanceTypeFamilyTags tags; 

            /**
             * InstanceTypeFamilyId.
             */
            public Builder instanceTypeFamilyId(String instanceTypeFamilyId) {
                this.instanceTypeFamilyId = instanceTypeFamilyId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(InstanceTypeFamilyTags tags) {
                this.tags = tags;
                return this;
            }

            public InstanceTypeFamiliesInstanceTypeFamily build() {
                return new InstanceTypeFamiliesInstanceTypeFamily(this);
            } 

        } 

    }
    public static class InstanceFamilyGroupInstanceTypeFamilies extends TeaModel {
        @NameInMap("InstanceTypeFamily")
        private java.util.List < InstanceTypeFamiliesInstanceTypeFamily> instanceTypeFamily;

        private InstanceFamilyGroupInstanceTypeFamilies(Builder builder) {
            this.instanceTypeFamily = builder.instanceTypeFamily;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceFamilyGroupInstanceTypeFamilies create() {
            return builder().build();
        }

        /**
         * @return instanceTypeFamily
         */
        public java.util.List < InstanceTypeFamiliesInstanceTypeFamily> getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public static final class Builder {
            private java.util.List < InstanceTypeFamiliesInstanceTypeFamily> instanceTypeFamily; 

            /**
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(java.util.List < InstanceTypeFamiliesInstanceTypeFamily> instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            public InstanceFamilyGroupInstanceTypeFamilies build() {
                return new InstanceFamilyGroupInstanceTypeFamilies(this);
            } 

        } 

    }
    public static class InstanceFamilyGroup extends TeaModel {
        @NameInMap("InstanceFamilyGroupName")
        private String instanceFamilyGroupName;

        @NameInMap("InstanceTypeFamilies")
        private InstanceFamilyGroupInstanceTypeFamilies instanceTypeFamilies;

        private InstanceFamilyGroup(Builder builder) {
            this.instanceFamilyGroupName = builder.instanceFamilyGroupName;
            this.instanceTypeFamilies = builder.instanceTypeFamilies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceFamilyGroup create() {
            return builder().build();
        }

        /**
         * @return instanceFamilyGroupName
         */
        public String getInstanceFamilyGroupName() {
            return this.instanceFamilyGroupName;
        }

        /**
         * @return instanceTypeFamilies
         */
        public InstanceFamilyGroupInstanceTypeFamilies getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

        public static final class Builder {
            private String instanceFamilyGroupName; 
            private InstanceFamilyGroupInstanceTypeFamilies instanceTypeFamilies; 

            /**
             * InstanceFamilyGroupName.
             */
            public Builder instanceFamilyGroupName(String instanceFamilyGroupName) {
                this.instanceFamilyGroupName = instanceFamilyGroupName;
                return this;
            }

            /**
             * InstanceTypeFamilies.
             */
            public Builder instanceTypeFamilies(InstanceFamilyGroupInstanceTypeFamilies instanceTypeFamilies) {
                this.instanceTypeFamilies = instanceTypeFamilies;
                return this;
            }

            public InstanceFamilyGroup build() {
                return new InstanceFamilyGroup(this);
            } 

        } 

    }
    public static class InstanceFamilyGroups extends TeaModel {
        @NameInMap("InstanceFamilyGroup")
        private java.util.List < InstanceFamilyGroup> instanceFamilyGroup;

        private InstanceFamilyGroups(Builder builder) {
            this.instanceFamilyGroup = builder.instanceFamilyGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceFamilyGroups create() {
            return builder().build();
        }

        /**
         * @return instanceFamilyGroup
         */
        public java.util.List < InstanceFamilyGroup> getInstanceFamilyGroup() {
            return this.instanceFamilyGroup;
        }

        public static final class Builder {
            private java.util.List < InstanceFamilyGroup> instanceFamilyGroup; 

            /**
             * InstanceFamilyGroup.
             */
            public Builder instanceFamilyGroup(java.util.List < InstanceFamilyGroup> instanceFamilyGroup) {
                this.instanceFamilyGroup = instanceFamilyGroup;
                return this;
            }

            public InstanceFamilyGroups build() {
                return new InstanceFamilyGroups(this);
            } 

        } 

    }
    public static class ProductCategory extends TeaModel {
        @NameInMap("InstanceFamilyGroups")
        private InstanceFamilyGroups instanceFamilyGroups;

        @NameInMap("ProductName")
        private String productName;

        private ProductCategory(Builder builder) {
            this.instanceFamilyGroups = builder.instanceFamilyGroups;
            this.productName = builder.productName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductCategory create() {
            return builder().build();
        }

        /**
         * @return instanceFamilyGroups
         */
        public InstanceFamilyGroups getInstanceFamilyGroups() {
            return this.instanceFamilyGroups;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        public static final class Builder {
            private InstanceFamilyGroups instanceFamilyGroups; 
            private String productName; 

            /**
             * InstanceFamilyGroups.
             */
            public Builder instanceFamilyGroups(InstanceFamilyGroups instanceFamilyGroups) {
                this.instanceFamilyGroups = instanceFamilyGroups;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            public ProductCategory build() {
                return new ProductCategory(this);
            } 

        } 

    }
    public static class ProductCategories extends TeaModel {
        @NameInMap("ProductCategory")
        private java.util.List < ProductCategory> productCategory;

        private ProductCategories(Builder builder) {
            this.productCategory = builder.productCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductCategories create() {
            return builder().build();
        }

        /**
         * @return productCategory
         */
        public java.util.List < ProductCategory> getProductCategory() {
            return this.productCategory;
        }

        public static final class Builder {
            private java.util.List < ProductCategory> productCategory; 

            /**
             * ProductCategory.
             */
            public Builder productCategory(java.util.List < ProductCategory> productCategory) {
                this.productCategory = productCategory;
                return this;
            }

            public ProductCategories build() {
                return new ProductCategories(this);
            } 

        } 

    }
    public static class ZoneTags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < String > tag;

        private ZoneTags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneTags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < String > getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < String > tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < String > tag) {
                this.tag = tag;
                return this;
            }

            public ZoneTags build() {
                return new ZoneTags(this);
            } 

        } 

    }
    public static class Zone extends TeaModel {
        @NameInMap("Tags")
        private ZoneTags tags;

        @NameInMap("ZoneId")
        private String zoneId;

        private Zone(Builder builder) {
            this.tags = builder.tags;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zone create() {
            return builder().build();
        }

        /**
         * @return tags
         */
        public ZoneTags getTags() {
            return this.tags;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private ZoneTags tags; 
            private String zoneId; 

            /**
             * Tags.
             */
            public Builder tags(ZoneTags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Zone build() {
                return new Zone(this);
            } 

        } 

    }
    public static class Zones extends TeaModel {
        @NameInMap("Zone")
        private java.util.List < Zone> zone;

        private Zones(Builder builder) {
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return zone
         */
        public java.util.List < Zone> getZone() {
            return this.zone;
        }

        public static final class Builder {
            private java.util.List < Zone> zone; 

            /**
             * Zone.
             */
            public Builder zone(java.util.List < Zone> zone) {
                this.zone = zone;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
    public static class ResourceDisplay extends TeaModel {
        @NameInMap("InstanceCategories")
        private InstanceCategories instanceCategories;

        @NameInMap("InstanceChargeTypes")
        private InstanceChargeTypes instanceChargeTypes;

        @NameInMap("ProductCategories")
        private ProductCategories productCategories;

        @NameInMap("Zones")
        private Zones zones;

        private ResourceDisplay(Builder builder) {
            this.instanceCategories = builder.instanceCategories;
            this.instanceChargeTypes = builder.instanceChargeTypes;
            this.productCategories = builder.productCategories;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDisplay create() {
            return builder().build();
        }

        /**
         * @return instanceCategories
         */
        public InstanceCategories getInstanceCategories() {
            return this.instanceCategories;
        }

        /**
         * @return instanceChargeTypes
         */
        public InstanceChargeTypes getInstanceChargeTypes() {
            return this.instanceChargeTypes;
        }

        /**
         * @return productCategories
         */
        public ProductCategories getProductCategories() {
            return this.productCategories;
        }

        /**
         * @return zones
         */
        public Zones getZones() {
            return this.zones;
        }

        public static final class Builder {
            private InstanceCategories instanceCategories; 
            private InstanceChargeTypes instanceChargeTypes; 
            private ProductCategories productCategories; 
            private Zones zones; 

            /**
             * InstanceCategories.
             */
            public Builder instanceCategories(InstanceCategories instanceCategories) {
                this.instanceCategories = instanceCategories;
                return this;
            }

            /**
             * InstanceChargeTypes.
             */
            public Builder instanceChargeTypes(InstanceChargeTypes instanceChargeTypes) {
                this.instanceChargeTypes = instanceChargeTypes;
                return this;
            }

            /**
             * ProductCategories.
             */
            public Builder productCategories(ProductCategories productCategories) {
                this.productCategories = productCategories;
                return this;
            }

            /**
             * Zones.
             */
            public Builder zones(Zones zones) {
                this.zones = zones;
                return this;
            }

            public ResourceDisplay build() {
                return new ResourceDisplay(this);
            } 

        } 

    }
}
