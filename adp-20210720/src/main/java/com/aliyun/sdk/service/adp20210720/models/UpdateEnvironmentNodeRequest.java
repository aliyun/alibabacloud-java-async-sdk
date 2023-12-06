// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnvironmentNodeRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnvironmentNodeRequest</p>
 */
public class UpdateEnvironmentNodeRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Path
    @NameInMap("nodeUID")
    @Validation(required = true)
    private String nodeUID;

    @Body
    @NameInMap("applicationDisk")
    private String applicationDisk;

    @Body
    @NameInMap("etcdDisk")
    private String etcdDisk;

    @Body
    @NameInMap("labels")
    private java.util.Map < String, ? > labels;

    @Body
    @NameInMap("rootPassword")
    private String rootPassword;

    @Body
    @NameInMap("taints")
    private java.util.List < Taints> taints;

    @Body
    @NameInMap("tridentSystemDisk")
    private String tridentSystemDisk;

    @Body
    @NameInMap("tridentSystemSizeDisk")
    private Integer tridentSystemSizeDisk;

    private UpdateEnvironmentNodeRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.nodeUID = builder.nodeUID;
        this.applicationDisk = builder.applicationDisk;
        this.etcdDisk = builder.etcdDisk;
        this.labels = builder.labels;
        this.rootPassword = builder.rootPassword;
        this.taints = builder.taints;
        this.tridentSystemDisk = builder.tridentSystemDisk;
        this.tridentSystemSizeDisk = builder.tridentSystemSizeDisk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnvironmentNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return nodeUID
     */
    public String getNodeUID() {
        return this.nodeUID;
    }

    /**
     * @return applicationDisk
     */
    public String getApplicationDisk() {
        return this.applicationDisk;
    }

    /**
     * @return etcdDisk
     */
    public String getEtcdDisk() {
        return this.etcdDisk;
    }

    /**
     * @return labels
     */
    public java.util.Map < String, ? > getLabels() {
        return this.labels;
    }

    /**
     * @return rootPassword
     */
    public String getRootPassword() {
        return this.rootPassword;
    }

    /**
     * @return taints
     */
    public java.util.List < Taints> getTaints() {
        return this.taints;
    }

    /**
     * @return tridentSystemDisk
     */
    public String getTridentSystemDisk() {
        return this.tridentSystemDisk;
    }

    /**
     * @return tridentSystemSizeDisk
     */
    public Integer getTridentSystemSizeDisk() {
        return this.tridentSystemSizeDisk;
    }

    public static final class Builder extends Request.Builder<UpdateEnvironmentNodeRequest, Builder> {
        private String uid; 
        private String nodeUID; 
        private String applicationDisk; 
        private String etcdDisk; 
        private java.util.Map < String, ? > labels; 
        private String rootPassword; 
        private java.util.List < Taints> taints; 
        private String tridentSystemDisk; 
        private Integer tridentSystemSizeDisk; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnvironmentNodeRequest request) {
            super(request);
            this.uid = request.uid;
            this.nodeUID = request.nodeUID;
            this.applicationDisk = request.applicationDisk;
            this.etcdDisk = request.etcdDisk;
            this.labels = request.labels;
            this.rootPassword = request.rootPassword;
            this.taints = request.taints;
            this.tridentSystemDisk = request.tridentSystemDisk;
            this.tridentSystemSizeDisk = request.tridentSystemSizeDisk;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * nodeUID.
         */
        public Builder nodeUID(String nodeUID) {
            this.putPathParameter("nodeUID", nodeUID);
            this.nodeUID = nodeUID;
            return this;
        }

        /**
         * applicationDisk.
         */
        public Builder applicationDisk(String applicationDisk) {
            this.putBodyParameter("applicationDisk", applicationDisk);
            this.applicationDisk = applicationDisk;
            return this;
        }

        /**
         * etcdDisk.
         */
        public Builder etcdDisk(String etcdDisk) {
            this.putBodyParameter("etcdDisk", etcdDisk);
            this.etcdDisk = etcdDisk;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.Map < String, ? > labels) {
            this.putBodyParameter("labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * rootPassword.
         */
        public Builder rootPassword(String rootPassword) {
            this.putBodyParameter("rootPassword", rootPassword);
            this.rootPassword = rootPassword;
            return this;
        }

        /**
         * taints.
         */
        public Builder taints(java.util.List < Taints> taints) {
            this.putBodyParameter("taints", taints);
            this.taints = taints;
            return this;
        }

        /**
         * tridentSystemDisk.
         */
        public Builder tridentSystemDisk(String tridentSystemDisk) {
            this.putBodyParameter("tridentSystemDisk", tridentSystemDisk);
            this.tridentSystemDisk = tridentSystemDisk;
            return this;
        }

        /**
         * tridentSystemSizeDisk.
         */
        public Builder tridentSystemSizeDisk(Integer tridentSystemSizeDisk) {
            this.putBodyParameter("tridentSystemSizeDisk", tridentSystemSizeDisk);
            this.tridentSystemSizeDisk = tridentSystemSizeDisk;
            return this;
        }

        @Override
        public UpdateEnvironmentNodeRequest build() {
            return new UpdateEnvironmentNodeRequest(this);
        } 

    } 

    public static class Taints extends TeaModel {
        @NameInMap("effect")
        private String effect;

        @NameInMap("key")
        private String key;

        @NameInMap("value")
        private String value;

        private Taints(Builder builder) {
            this.effect = builder.effect;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Taints create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String effect; 
            private String key; 
            private String value; 

            /**
             * effect.
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Taints build() {
                return new Taints(this);
            } 

        } 

    }
}
