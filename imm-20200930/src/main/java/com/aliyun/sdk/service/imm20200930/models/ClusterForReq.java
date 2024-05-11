// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.Map < String, ? > customLabels;

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
    public java.util.Map < String, ? > getCustomLabels() {
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
        private java.util.Map < String, ? > customLabels; 
        private String name; 
        private String objectId; 

        /**
         * Cover.
         */
        public Builder cover(Cover cover) {
            this.cover = cover;
            return this;
        }

        /**
         * CustomId.
         */
        public Builder customId(String customId) {
            this.customId = customId;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(java.util.Map < String, ? > customLabels) {
            this.customLabels = customLabels;
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
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        public ClusterForReq build() {
            return new ClusterForReq(this);
        } 

    } 

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

            /**
             * FigureId.
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
    public static class Cover extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Figures")
        private java.util.List < Figures> figures;

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
        public java.util.List < Figures> getFigures() {
            return this.figures;
        }

        public static final class Builder {
            private java.util.List < Figures> figures; 

            /**
             * Figures.
             */
            public Builder figures(java.util.List < Figures> figures) {
                this.figures = figures;
                return this;
            }

            public Cover build() {
                return new Cover(this);
            } 

        } 

    }
}
