// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link ListWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowResponseBody</p>
 */
public class ListWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private Long httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListWorkflowResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpCode
     */
    public Long getHttpCode() {
        return this.httpCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private Long httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListWorkflowResponseBody model) {
            this.data = model.data;
            this.httpCode = model.httpCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpCode.
         */
        public Builder httpCode(Long httpCode) {
            this.httpCode = httpCode;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListWorkflowResponseBody build() {
            return new ListWorkflowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowResponseBody</p>
     */
    public static class HumanPose extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUsage")
        private String bizUsage;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        private HumanPose(Builder builder) {
            this.bizUsage = builder.bizUsage;
            this.id = builder.id;
            this.name = builder.name;
            this.objectType = builder.objectType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HumanPose create() {
            return builder().build();
        }

        /**
         * @return bizUsage
         */
        public String getBizUsage() {
            return this.bizUsage;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bizUsage; 
            private Long id; 
            private String name; 
            private String objectType; 
            private Long status; 

            private Builder() {
            } 

            private Builder(HumanPose model) {
                this.bizUsage = model.bizUsage;
                this.id = model.id;
                this.name = model.name;
                this.objectType = model.objectType;
                this.status = model.status;
            } 

            /**
             * BizUsage.
             */
            public Builder bizUsage(String bizUsage) {
                this.bizUsage = bizUsage;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public HumanPose build() {
                return new HumanPose(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowResponseBody</p>
     */
    public static class Mannequins extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUsage")
        private String bizUsage;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        private Mannequins(Builder builder) {
            this.bizUsage = builder.bizUsage;
            this.id = builder.id;
            this.name = builder.name;
            this.objectType = builder.objectType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mannequins create() {
            return builder().build();
        }

        /**
         * @return bizUsage
         */
        public String getBizUsage() {
            return this.bizUsage;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bizUsage; 
            private Long id; 
            private String name; 
            private String objectType; 
            private Long status; 

            private Builder() {
            } 

            private Builder(Mannequins model) {
                this.bizUsage = model.bizUsage;
                this.id = model.id;
                this.name = model.name;
                this.objectType = model.objectType;
                this.status = model.status;
            } 

            /**
             * BizUsage.
             */
            public Builder bizUsage(String bizUsage) {
                this.bizUsage = bizUsage;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public Mannequins build() {
                return new Mannequins(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowResponseBody</p>
     */
    public static class Object extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUsage")
        private String bizUsage;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        private Object(Builder builder) {
            this.bizUsage = builder.bizUsage;
            this.id = builder.id;
            this.name = builder.name;
            this.objectType = builder.objectType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return bizUsage
         */
        public String getBizUsage() {
            return this.bizUsage;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bizUsage; 
            private Long id; 
            private String name; 
            private String objectType; 
            private Long status; 

            private Builder() {
            } 

            private Builder(Object model) {
                this.bizUsage = model.bizUsage;
                this.id = model.id;
                this.name = model.name;
                this.objectType = model.objectType;
                this.status = model.status;
            } 

            /**
             * BizUsage.
             */
            public Builder bizUsage(String bizUsage) {
                this.bizUsage = bizUsage;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowResponseBody</p>
     */
    public static class ObjectGeneration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUsage")
        private String bizUsage;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        private ObjectGeneration(Builder builder) {
            this.bizUsage = builder.bizUsage;
            this.id = builder.id;
            this.name = builder.name;
            this.objectType = builder.objectType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectGeneration create() {
            return builder().build();
        }

        /**
         * @return bizUsage
         */
        public String getBizUsage() {
            return this.bizUsage;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bizUsage; 
            private Long id; 
            private String name; 
            private String objectType; 
            private Long status; 

            private Builder() {
            } 

            private Builder(ObjectGeneration model) {
                this.bizUsage = model.bizUsage;
                this.id = model.id;
                this.name = model.name;
                this.objectType = model.objectType;
                this.status = model.status;
            } 

            /**
             * BizUsage.
             */
            public Builder bizUsage(String bizUsage) {
                this.bizUsage = bizUsage;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public ObjectGeneration build() {
                return new ObjectGeneration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowResponseBody</p>
     */
    public static class Scene extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUsage")
        private String bizUsage;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        private Scene(Builder builder) {
            this.bizUsage = builder.bizUsage;
            this.id = builder.id;
            this.name = builder.name;
            this.objectType = builder.objectType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scene create() {
            return builder().build();
        }

        /**
         * @return bizUsage
         */
        public String getBizUsage() {
            return this.bizUsage;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bizUsage; 
            private Long id; 
            private String name; 
            private String objectType; 
            private Long status; 

            private Builder() {
            } 

            private Builder(Scene model) {
                this.bizUsage = model.bizUsage;
                this.id = model.id;
                this.name = model.name;
                this.objectType = model.objectType;
                this.status = model.status;
            } 

            /**
             * BizUsage.
             */
            public Builder bizUsage(String bizUsage) {
                this.bizUsage = bizUsage;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public Scene build() {
                return new Scene(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HumanPose")
        private java.util.List<HumanPose> humanPose;

        @com.aliyun.core.annotation.NameInMap("Mannequins")
        private java.util.List<Mannequins> mannequins;

        @com.aliyun.core.annotation.NameInMap("Object")
        private java.util.List<Object> object;

        @com.aliyun.core.annotation.NameInMap("ObjectGeneration")
        private java.util.List<ObjectGeneration> objectGeneration;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private java.util.List<Scene> scene;

        private Data(Builder builder) {
            this.humanPose = builder.humanPose;
            this.mannequins = builder.mannequins;
            this.object = builder.object;
            this.objectGeneration = builder.objectGeneration;
            this.scene = builder.scene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return humanPose
         */
        public java.util.List<HumanPose> getHumanPose() {
            return this.humanPose;
        }

        /**
         * @return mannequins
         */
        public java.util.List<Mannequins> getMannequins() {
            return this.mannequins;
        }

        /**
         * @return object
         */
        public java.util.List<Object> getObject() {
            return this.object;
        }

        /**
         * @return objectGeneration
         */
        public java.util.List<ObjectGeneration> getObjectGeneration() {
            return this.objectGeneration;
        }

        /**
         * @return scene
         */
        public java.util.List<Scene> getScene() {
            return this.scene;
        }

        public static final class Builder {
            private java.util.List<HumanPose> humanPose; 
            private java.util.List<Mannequins> mannequins; 
            private java.util.List<Object> object; 
            private java.util.List<ObjectGeneration> objectGeneration; 
            private java.util.List<Scene> scene; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.humanPose = model.humanPose;
                this.mannequins = model.mannequins;
                this.object = model.object;
                this.objectGeneration = model.objectGeneration;
                this.scene = model.scene;
            } 

            /**
             * HumanPose.
             */
            public Builder humanPose(java.util.List<HumanPose> humanPose) {
                this.humanPose = humanPose;
                return this;
            }

            /**
             * Mannequins.
             */
            public Builder mannequins(java.util.List<Mannequins> mannequins) {
                this.mannequins = mannequins;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(java.util.List<Object> object) {
                this.object = object;
                return this;
            }

            /**
             * ObjectGeneration.
             */
            public Builder objectGeneration(java.util.List<ObjectGeneration> objectGeneration) {
                this.objectGeneration = objectGeneration;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(java.util.List<Scene> scene) {
                this.scene = scene;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
