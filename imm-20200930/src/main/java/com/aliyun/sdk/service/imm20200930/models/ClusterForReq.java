// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link ClusterForReq} extends {@link TeaModel}
 *
 * <p>ClusterForReq</p>
 */
public class ClusterForReq extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cover")
    private Cover cover;

    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map<String, ?> customLabels;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    private ClusterForReq(Builder builder) {
        this.cover = builder.cover;
        this.customId = builder.customId;
        this.customLabels = builder.customLabels;
        this.name = builder.name;
        this.objectId = builder.objectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClusterForReq create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cover
     */
    public Cover getCover() {
        return this.cover;
    }

    /**
     * @return customId
     */
    public String getCustomId() {
        return this.customId;
    }

    /**
     * @return customLabels
     */
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    public static final class Builder {
        private Cover cover; 
        private String customId; 
        private java.util.Map<String, ?> customLabels; 
        private String name; 
        private String objectId; 

        private Builder() {
        } 

        private Builder(ClusterForReq model) {
            this.cover = model.cover;
            this.customId = model.customId;
            this.customLabels = model.customLabels;
            this.name = model.name;
            this.objectId = model.objectId;
        } 

        /**
         * <p>The cover.</p>
         */
        public Builder cover(Cover cover) {
            this.cover = cover;
            return this;
        }

        /**
         * <p>The custom ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder customId(String customId) {
            this.customId = customId;
            return this;
        }

        /**
         * <p>The custom labels.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Bucket&quot;: &quot;examplebucket&quot;}</p>
         */
        public Builder customLabels(java.util.Map<String, ?> customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Cluster-99b1c333-86dc-45da-8c6****</p>
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        public ClusterForReq build() {
            return new ClusterForReq(this);
        } 

    } 

    /**
     * 
     * {@link ClusterForReq} extends {@link TeaModel}
     *
     * <p>ClusterForReq</p>
     */
    public static class Figures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FigureId")
        private String figureId;

        private Figures(Builder builder) {
            this.figureId = builder.figureId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Figures create() {
            return builder().build();
        }

        /**
         * @return figureId
         */
        public String getFigureId() {
            return this.figureId;
        }

        public static final class Builder {
            private String figureId; 

            private Builder() {
            } 

            private Builder(Figures model) {
                this.figureId = model.figureId;
            } 

            /**
             * <p>The person ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2cb3c51e-b406-4b0c-af1b-897d88e1****</p>
             */
            public Builder figureId(String figureId) {
                this.figureId = figureId;
                return this;
            }

            public Figures build() {
                return new Figures(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClusterForReq} extends {@link TeaModel}
     *
     * <p>ClusterForReq</p>
     */
    public static class Cover extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Figures")
        private java.util.List<Figures> figures;

        private Cover(Builder builder) {
            this.figures = builder.figures;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cover create() {
            return builder().build();
        }

        /**
         * @return figures
         */
        public java.util.List<Figures> getFigures() {
            return this.figures;
        }

        public static final class Builder {
            private java.util.List<Figures> figures; 

            private Builder() {
            } 

            private Builder(Cover model) {
                this.figures = model.figures;
            } 

            /**
             * <p>The persons.</p>
             */
            public Builder figures(java.util.List<Figures> figures) {
                this.figures = figures;
                return this;
            }

            public Cover build() {
                return new Cover(this);
            } 

        } 

    }
}
