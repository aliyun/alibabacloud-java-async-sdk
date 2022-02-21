// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCategoriesResponseBody</p>
 */
public class DescribeCategoriesResponseBody extends TeaModel {
    @NameInMap("Categories")
    private Categories categories;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCategoriesResponseBody(Builder builder) {
        this.categories = builder.categories;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCategoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return categories
     */
    public Categories getCategories() {
        return this.categories;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Categories categories; 
        private String code; 
        private String message; 
        private String requestId; 

        /**
         * Categories.
         */
        public Builder categories(Categories categories) {
            this.categories = categories;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCategoriesResponseBody build() {
            return new DescribeCategoriesResponseBody(this);
        } 

    } 

    public static class DemoProject extends TeaModel {
        @NameInMap("PackageDownloadUrl")
        private String packageDownloadUrl;

        @NameInMap("PackageUrl")
        private String packageUrl;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SourceUrl")
        private String sourceUrl;

        private DemoProject(Builder builder) {
            this.packageDownloadUrl = builder.packageDownloadUrl;
            this.packageUrl = builder.packageUrl;
            this.regionId = builder.regionId;
            this.sourceUrl = builder.sourceUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DemoProject create() {
            return builder().build();
        }

        /**
         * @return packageDownloadUrl
         */
        public String getPackageDownloadUrl() {
            return this.packageDownloadUrl;
        }

        /**
         * @return packageUrl
         */
        public String getPackageUrl() {
            return this.packageUrl;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sourceUrl
         */
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public static final class Builder {
            private String packageDownloadUrl; 
            private String packageUrl; 
            private String regionId; 
            private String sourceUrl; 

            /**
             * PackageDownloadUrl.
             */
            public Builder packageDownloadUrl(String packageDownloadUrl) {
                this.packageDownloadUrl = packageDownloadUrl;
                return this;
            }

            /**
             * PackageUrl.
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SourceUrl.
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
                return this;
            }

            public DemoProject build() {
                return new DemoProject(this);
            } 

        } 

    }
    public static class DemoProjects extends TeaModel {
        @NameInMap("DemoProject")
        private java.util.List < DemoProject> demoProject;

        private DemoProjects(Builder builder) {
            this.demoProject = builder.demoProject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DemoProjects create() {
            return builder().build();
        }

        /**
         * @return demoProject
         */
        public java.util.List < DemoProject> getDemoProject() {
            return this.demoProject;
        }

        public static final class Builder {
            private java.util.List < DemoProject> demoProject; 

            /**
             * DemoProject.
             */
            public Builder demoProject(java.util.List < DemoProject> demoProject) {
                this.demoProject = demoProject;
                return this;
            }

            public DemoProjects build() {
                return new DemoProjects(this);
            } 

        } 

    }
    public static class Category extends TeaModel {
        @NameInMap("CategoryDescription")
        private String categoryDescription;

        @NameInMap("CategoryId")
        private String categoryId;

        @NameInMap("CategoryLogo")
        private String categoryLogo;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DemoProjects")
        private DemoProjects demoProjects;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Category(Builder builder) {
            this.categoryDescription = builder.categoryDescription;
            this.categoryId = builder.categoryId;
            this.categoryLogo = builder.categoryLogo;
            this.categoryName = builder.categoryName;
            this.createTime = builder.createTime;
            this.demoProjects = builder.demoProjects;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Category create() {
            return builder().build();
        }

        /**
         * @return categoryDescription
         */
        public String getCategoryDescription() {
            return this.categoryDescription;
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryLogo
         */
        public String getCategoryLogo() {
            return this.categoryLogo;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return demoProjects
         */
        public DemoProjects getDemoProjects() {
            return this.demoProjects;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String categoryDescription; 
            private String categoryId; 
            private String categoryLogo; 
            private String categoryName; 
            private String createTime; 
            private DemoProjects demoProjects; 
            private String updateTime; 

            /**
             * CategoryDescription.
             */
            public Builder categoryDescription(String categoryDescription) {
                this.categoryDescription = categoryDescription;
                return this;
            }

            /**
             * CategoryId.
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryLogo.
             */
            public Builder categoryLogo(String categoryLogo) {
                this.categoryLogo = categoryLogo;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DemoProjects.
             */
            public Builder demoProjects(DemoProjects demoProjects) {
                this.demoProjects = demoProjects;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Category build() {
                return new Category(this);
            } 

        } 

    }
    public static class Categories extends TeaModel {
        @NameInMap("Category")
        private java.util.List < Category> category;

        private Categories(Builder builder) {
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Categories create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public java.util.List < Category> getCategory() {
            return this.category;
        }

        public static final class Builder {
            private java.util.List < Category> category; 

            /**
             * Category.
             */
            public Builder category(java.util.List < Category> category) {
                this.category = category;
                return this;
            }

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
}
