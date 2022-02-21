// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomPersonsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomPersonsResponseBody</p>
 */
public class ListCustomPersonsResponseBody extends TeaModel {
    @NameInMap("Categories")
    private Categories categories;

    @NameInMap("RequestId")
    private String requestId;

    private ListCustomPersonsResponseBody(Builder builder) {
        this.categories = builder.categories;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomPersonsResponseBody create() {
        return builder().build();
    }

    /**
     * @return categories
     */
    public Categories getCategories() {
        return this.categories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Categories categories; 
        private String requestId; 

        /**
         * Categories.
         */
        public Builder categories(Categories categories) {
            this.categories = categories;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCustomPersonsResponseBody build() {
            return new ListCustomPersonsResponseBody(this);
        } 

    } 

    public static class Face extends TeaModel {
        @NameInMap("FaceId")
        private String faceId;

        @NameInMap("ImageUrl")
        private String imageUrl;

        private Face(Builder builder) {
            this.faceId = builder.faceId;
            this.imageUrl = builder.imageUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Face create() {
            return builder().build();
        }

        /**
         * @return faceId
         */
        public String getFaceId() {
            return this.faceId;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        public static final class Builder {
            private String faceId; 
            private String imageUrl; 

            /**
             * FaceId.
             */
            public Builder faceId(String faceId) {
                this.faceId = faceId;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            public Face build() {
                return new Face(this);
            } 

        } 

    }
    public static class Faces extends TeaModel {
        @NameInMap("Face")
        private java.util.List < Face> face;

        private Faces(Builder builder) {
            this.face = builder.face;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Faces create() {
            return builder().build();
        }

        /**
         * @return face
         */
        public java.util.List < Face> getFace() {
            return this.face;
        }

        public static final class Builder {
            private java.util.List < Face> face; 

            /**
             * Face.
             */
            public Builder face(java.util.List < Face> face) {
                this.face = face;
                return this;
            }

            public Faces build() {
                return new Faces(this);
            } 

        } 

    }
    public static class Person extends TeaModel {
        @NameInMap("Faces")
        private Faces faces;

        @NameInMap("PersonDescription")
        private String personDescription;

        @NameInMap("PersonId")
        private String personId;

        @NameInMap("PersonName")
        private String personName;

        private Person(Builder builder) {
            this.faces = builder.faces;
            this.personDescription = builder.personDescription;
            this.personId = builder.personId;
            this.personName = builder.personName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Person create() {
            return builder().build();
        }

        /**
         * @return faces
         */
        public Faces getFaces() {
            return this.faces;
        }

        /**
         * @return personDescription
         */
        public String getPersonDescription() {
            return this.personDescription;
        }

        /**
         * @return personId
         */
        public String getPersonId() {
            return this.personId;
        }

        /**
         * @return personName
         */
        public String getPersonName() {
            return this.personName;
        }

        public static final class Builder {
            private Faces faces; 
            private String personDescription; 
            private String personId; 
            private String personName; 

            /**
             * Faces.
             */
            public Builder faces(Faces faces) {
                this.faces = faces;
                return this;
            }

            /**
             * PersonDescription.
             */
            public Builder personDescription(String personDescription) {
                this.personDescription = personDescription;
                return this;
            }

            /**
             * PersonId.
             */
            public Builder personId(String personId) {
                this.personId = personId;
                return this;
            }

            /**
             * PersonName.
             */
            public Builder personName(String personName) {
                this.personName = personName;
                return this;
            }

            public Person build() {
                return new Person(this);
            } 

        } 

    }
    public static class Persons extends TeaModel {
        @NameInMap("Person")
        private java.util.List < Person> person;

        private Persons(Builder builder) {
            this.person = builder.person;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Persons create() {
            return builder().build();
        }

        /**
         * @return person
         */
        public java.util.List < Person> getPerson() {
            return this.person;
        }

        public static final class Builder {
            private java.util.List < Person> person; 

            /**
             * Person.
             */
            public Builder person(java.util.List < Person> person) {
                this.person = person;
                return this;
            }

            public Persons build() {
                return new Persons(this);
            } 

        } 

    }
    public static class Category extends TeaModel {
        @NameInMap("CategoryDescription")
        private String categoryDescription;

        @NameInMap("CategoryId")
        private String categoryId;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("Persons")
        private Persons persons;

        private Category(Builder builder) {
            this.categoryDescription = builder.categoryDescription;
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.persons = builder.persons;
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
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return persons
         */
        public Persons getPersons() {
            return this.persons;
        }

        public static final class Builder {
            private String categoryDescription; 
            private String categoryId; 
            private String categoryName; 
            private Persons persons; 

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
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * Persons.
             */
            public Builder persons(Persons persons) {
                this.persons = persons;
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
