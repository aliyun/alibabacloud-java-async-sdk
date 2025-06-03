// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link DescribeMigrationJobCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeMigrationJobCountRequest</p>
 */
public class DescribeMigrationJobCountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("batchTaskGroupId")
    private Long batchTaskGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cutoverPlanId")
    private String cutoverPlanId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outSideId")
    private String outSideId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("surveyResourceId")
    private Long surveyResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tagList")
    private java.util.List<TagList> tagList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("typeList")
    private java.util.List<String> typeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("usedType")
    private String usedType;

    private DescribeMigrationJobCountRequest(Builder builder) {
        super(builder);
        this.batchTaskGroupId = builder.batchTaskGroupId;
        this.cutoverPlanId = builder.cutoverPlanId;
        this.name = builder.name;
        this.outSideId = builder.outSideId;
        this.source = builder.source;
        this.surveyResourceId = builder.surveyResourceId;
        this.tagList = builder.tagList;
        this.type = builder.type;
        this.typeList = builder.typeList;
        this.usedType = builder.usedType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrationJobCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchTaskGroupId
     */
    public Long getBatchTaskGroupId() {
        return this.batchTaskGroupId;
    }

    /**
     * @return cutoverPlanId
     */
    public String getCutoverPlanId() {
        return this.cutoverPlanId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outSideId
     */
    public String getOutSideId() {
        return this.outSideId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return surveyResourceId
     */
    public Long getSurveyResourceId() {
        return this.surveyResourceId;
    }

    /**
     * @return tagList
     */
    public java.util.List<TagList> getTagList() {
        return this.tagList;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return typeList
     */
    public java.util.List<String> getTypeList() {
        return this.typeList;
    }

    /**
     * @return usedType
     */
    public String getUsedType() {
        return this.usedType;
    }

    public static final class Builder extends Request.Builder<DescribeMigrationJobCountRequest, Builder> {
        private Long batchTaskGroupId; 
        private String cutoverPlanId; 
        private String name; 
        private String outSideId; 
        private String source; 
        private Long surveyResourceId; 
        private java.util.List<TagList> tagList; 
        private String type; 
        private java.util.List<String> typeList; 
        private String usedType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMigrationJobCountRequest request) {
            super(request);
            this.batchTaskGroupId = request.batchTaskGroupId;
            this.cutoverPlanId = request.cutoverPlanId;
            this.name = request.name;
            this.outSideId = request.outSideId;
            this.source = request.source;
            this.surveyResourceId = request.surveyResourceId;
            this.tagList = request.tagList;
            this.type = request.type;
            this.typeList = request.typeList;
            this.usedType = request.usedType;
        } 

        /**
         * batchTaskGroupId.
         */
        public Builder batchTaskGroupId(Long batchTaskGroupId) {
            this.putBodyParameter("batchTaskGroupId", batchTaskGroupId);
            this.batchTaskGroupId = batchTaskGroupId;
            return this;
        }

        /**
         * cutoverPlanId.
         */
        public Builder cutoverPlanId(String cutoverPlanId) {
            this.putBodyParameter("cutoverPlanId", cutoverPlanId);
            this.cutoverPlanId = cutoverPlanId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * outSideId.
         */
        public Builder outSideId(String outSideId) {
            this.putBodyParameter("outSideId", outSideId);
            this.outSideId = outSideId;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * surveyResourceId.
         */
        public Builder surveyResourceId(Long surveyResourceId) {
            this.putBodyParameter("surveyResourceId", surveyResourceId);
            this.surveyResourceId = surveyResourceId;
            return this;
        }

        /**
         * tagList.
         */
        public Builder tagList(java.util.List<TagList> tagList) {
            this.putBodyParameter("tagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * typeList.
         */
        public Builder typeList(java.util.List<String> typeList) {
            this.putBodyParameter("typeList", typeList);
            this.typeList = typeList;
            return this;
        }

        /**
         * usedType.
         */
        public Builder usedType(String usedType) {
            this.putBodyParameter("usedType", usedType);
            this.usedType = usedType;
            return this;
        }

        @Override
        public DescribeMigrationJobCountRequest build() {
            return new DescribeMigrationJobCountRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMigrationJobCountRequest} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobCountRequest</p>
     */
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private TagList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
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

            private Builder() {
            } 

            private Builder(TagList model) {
                this.key = model.key;
                this.value = model.value;
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

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
}
