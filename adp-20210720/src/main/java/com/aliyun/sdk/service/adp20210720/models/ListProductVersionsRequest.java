// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListProductVersionsRequest</p>
 */
public class ListProductVersionsRequest extends Request {
    @Query
    @NameInMap("fuzzy")
    private String fuzzy;

    @Query
    @NameInMap("pageNum")
    private String pageNum;

    @Query
    @NameInMap("pageSize")
    private String pageSize;

    @Query
    @NameInMap("platforms")
    private java.util.List < Platforms> platforms;

    @Query
    @NameInMap("productName")
    private String productName;

    @Query
    @NameInMap("productUID")
    private String productUID;

    @Query
    @NameInMap("released")
    private Boolean released;

    @Query
    @NameInMap("supportedFoundationTypes")
    private java.util.List < String > supportedFoundationTypes;

    @Query
    @NameInMap("tag")
    private Tag tag;

    @Query
    @NameInMap("version")
    private String version;

    private ListProductVersionsRequest(Builder builder) {
        super(builder);
        this.fuzzy = builder.fuzzy;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.platforms = builder.platforms;
        this.productName = builder.productName;
        this.productUID = builder.productUID;
        this.released = builder.released;
        this.supportedFoundationTypes = builder.supportedFoundationTypes;
        this.tag = builder.tag;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fuzzy
     */
    public String getFuzzy() {
        return this.fuzzy;
    }

    /**
     * @return pageNum
     */
    public String getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return platforms
     */
    public java.util.List < Platforms> getPlatforms() {
        return this.platforms;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return productUID
     */
    public String getProductUID() {
        return this.productUID;
    }

    /**
     * @return released
     */
    public Boolean getReleased() {
        return this.released;
    }

    /**
     * @return supportedFoundationTypes
     */
    public java.util.List < String > getSupportedFoundationTypes() {
        return this.supportedFoundationTypes;
    }

    /**
     * @return tag
     */
    public Tag getTag() {
        return this.tag;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ListProductVersionsRequest, Builder> {
        private String fuzzy; 
        private String pageNum; 
        private String pageSize; 
        private java.util.List < Platforms> platforms; 
        private String productName; 
        private String productUID; 
        private Boolean released; 
        private java.util.List < String > supportedFoundationTypes; 
        private Tag tag; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ListProductVersionsRequest request) {
            super(request);
            this.fuzzy = request.fuzzy;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.platforms = request.platforms;
            this.productName = request.productName;
            this.productUID = request.productUID;
            this.released = request.released;
            this.supportedFoundationTypes = request.supportedFoundationTypes;
            this.tag = request.tag;
            this.version = request.version;
        } 

        /**
         * fuzzy.
         */
        public Builder fuzzy(String fuzzy) {
            this.putQueryParameter("fuzzy", fuzzy);
            this.fuzzy = fuzzy;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(String pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * platforms.
         */
        public Builder platforms(java.util.List < Platforms> platforms) {
            String platformsShrink = shrink(platforms, "platforms", "json");
            this.putQueryParameter("platforms", platformsShrink);
            this.platforms = platforms;
            return this;
        }

        /**
         * productName.
         */
        public Builder productName(String productName) {
            this.putQueryParameter("productName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * productUID.
         */
        public Builder productUID(String productUID) {
            this.putQueryParameter("productUID", productUID);
            this.productUID = productUID;
            return this;
        }

        /**
         * released.
         */
        public Builder released(Boolean released) {
            this.putQueryParameter("released", released);
            this.released = released;
            return this;
        }

        /**
         * supportedFoundationTypes.
         */
        public Builder supportedFoundationTypes(java.util.List < String > supportedFoundationTypes) {
            String supportedFoundationTypesShrink = shrink(supportedFoundationTypes, "supportedFoundationTypes", "json");
            this.putQueryParameter("supportedFoundationTypes", supportedFoundationTypesShrink);
            this.supportedFoundationTypes = supportedFoundationTypes;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(Tag tag) {
            String tagShrink = shrink(tag, "tag", "json");
            this.putQueryParameter("tag", tagShrink);
            this.tag = tag;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public ListProductVersionsRequest build() {
            return new ListProductVersionsRequest(this);
        } 

    } 

    public static class Platforms extends TeaModel {
        @NameInMap("architecture")
        private String architecture;

        @NameInMap("os")
        private String os;

        private Platforms(Builder builder) {
            this.architecture = builder.architecture;
            this.os = builder.os;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Platforms create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        public static final class Builder {
            private String architecture; 
            private String os; 

            /**
             * architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            public Platforms build() {
                return new Platforms(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
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
            private String key; 
            private String value; 

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

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
