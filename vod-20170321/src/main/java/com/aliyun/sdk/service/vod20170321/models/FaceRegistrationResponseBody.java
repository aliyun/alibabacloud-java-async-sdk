// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link FaceRegistrationResponseBody} extends {@link TeaModel}
 *
 * <p>FaceRegistrationResponseBody</p>
 */
public class FaceRegistrationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExistImageIds")
    private NonExistImageIds nonExistImageIds;

    @com.aliyun.core.annotation.NameInMap("RegisteredPerson")
    private RegisteredPerson registeredPerson;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private FaceRegistrationResponseBody(Builder builder) {
        this.nonExistImageIds = builder.nonExistImageIds;
        this.registeredPerson = builder.registeredPerson;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceRegistrationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nonExistImageIds
     */
    public NonExistImageIds getNonExistImageIds() {
        return this.nonExistImageIds;
    }

    /**
     * @return registeredPerson
     */
    public RegisteredPerson getRegisteredPerson() {
        return this.registeredPerson;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NonExistImageIds nonExistImageIds; 
        private RegisteredPerson registeredPerson; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(FaceRegistrationResponseBody model) {
            this.nonExistImageIds = model.nonExistImageIds;
            this.registeredPerson = model.registeredPerson;
            this.requestId = model.requestId;
        } 

        /**
         * NonExistImageIds.
         */
        public Builder nonExistImageIds(NonExistImageIds nonExistImageIds) {
            this.nonExistImageIds = nonExistImageIds;
            return this;
        }

        /**
         * RegisteredPerson.
         */
        public Builder registeredPerson(RegisteredPerson registeredPerson) {
            this.registeredPerson = registeredPerson;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FaceRegistrationResponseBody build() {
            return new FaceRegistrationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FaceRegistrationResponseBody} extends {@link TeaModel}
     *
     * <p>FaceRegistrationResponseBody</p>
     */
    public static class NonExistImageIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

        private NonExistImageIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistImageIds create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List<String> getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List<String> string; 

            private Builder() {
            } 

            private Builder(NonExistImageIds model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistImageIds build() {
                return new NonExistImageIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link FaceRegistrationResponseBody} extends {@link TeaModel}
     *
     * <p>FaceRegistrationResponseBody</p>
     */
    public static class Face extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("Quality")
        private String quality;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        private Face(Builder builder) {
            this.imageId = builder.imageId;
            this.quality = builder.quality;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Face create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return quality
         */
        public String getQuality() {
            return this.quality;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        public static final class Builder {
            private String imageId; 
            private String quality; 
            private String target; 

            private Builder() {
            } 

            private Builder(Face model) {
                this.imageId = model.imageId;
                this.quality = model.quality;
                this.target = model.target;
            } 

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Quality.
             */
            public Builder quality(String quality) {
                this.quality = quality;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            public Face build() {
                return new Face(this);
            } 

        } 

    }
    /**
     * 
     * {@link FaceRegistrationResponseBody} extends {@link TeaModel}
     *
     * <p>FaceRegistrationResponseBody</p>
     */
    public static class Faces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Face")
        private java.util.List<Face> face;

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
        public java.util.List<Face> getFace() {
            return this.face;
        }

        public static final class Builder {
            private java.util.List<Face> face; 

            private Builder() {
            } 

            private Builder(Faces model) {
                this.face = model.face;
            } 

            /**
             * Face.
             */
            public Builder face(java.util.List<Face> face) {
                this.face = face;
                return this;
            }

            public Faces build() {
                return new Faces(this);
            } 

        } 

    }
    /**
     * 
     * {@link FaceRegistrationResponseBody} extends {@link TeaModel}
     *
     * <p>FaceRegistrationResponseBody</p>
     */
    public static class RegisteredPerson extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Faces")
        private Faces faces;

        @com.aliyun.core.annotation.NameInMap("PersonId")
        private String personId;

        @com.aliyun.core.annotation.NameInMap("PersonName")
        private String personName;

        private RegisteredPerson(Builder builder) {
            this.faces = builder.faces;
            this.personId = builder.personId;
            this.personName = builder.personName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegisteredPerson create() {
            return builder().build();
        }

        /**
         * @return faces
         */
        public Faces getFaces() {
            return this.faces;
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
            private String personId; 
            private String personName; 

            private Builder() {
            } 

            private Builder(RegisteredPerson model) {
                this.faces = model.faces;
                this.personId = model.personId;
                this.personName = model.personName;
            } 

            /**
             * Faces.
             */
            public Builder faces(Faces faces) {
                this.faces = faces;
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

            public RegisteredPerson build() {
                return new RegisteredPerson(this);
            } 

        } 

    }
}
