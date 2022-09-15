// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link BatchModifyEtlMetaStatusRequest} extends {@link RequestModel}
 *
 * <p>BatchModifyEtlMetaStatusRequest</p>
 */
public class BatchModifyEtlMetaStatusRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Body
    @NameInMap("etlMetaKeyList")
    private java.util.List < String > etlMetaKeyList;

    @Body
    @NameInMap("etlMetaName")
    @Validation(required = true)
    private String etlMetaName;

    @Body
    @NameInMap("etlMetaTag")
    private String etlMetaTag;

    @Body
    @NameInMap("range")
    @Validation(required = true)
    private String range;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private BatchModifyEtlMetaStatusRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.etlMetaKeyList = builder.etlMetaKeyList;
        this.etlMetaName = builder.etlMetaName;
        this.etlMetaTag = builder.etlMetaTag;
        this.range = builder.range;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchModifyEtlMetaStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return etlMetaKeyList
     */
    public java.util.List < String > getEtlMetaKeyList() {
        return this.etlMetaKeyList;
    }

    /**
     * @return etlMetaName
     */
    public String getEtlMetaName() {
        return this.etlMetaName;
    }

    /**
     * @return etlMetaTag
     */
    public String getEtlMetaTag() {
        return this.etlMetaTag;
    }

    /**
     * @return range
     */
    public String getRange() {
        return this.range;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<BatchModifyEtlMetaStatusRequest, Builder> {
        private String project; 
        private java.util.List < String > etlMetaKeyList; 
        private String etlMetaName; 
        private String etlMetaTag; 
        private String range; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(BatchModifyEtlMetaStatusRequest request) {
            super(request);
            this.project = request.project;
            this.etlMetaKeyList = request.etlMetaKeyList;
            this.etlMetaName = request.etlMetaName;
            this.etlMetaTag = request.etlMetaTag;
            this.range = request.range;
            this.type = request.type;
        } 

        /**
         * project 名称
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * 当 range 的值为 "list" 时有效，匹配list中的 metaKey
         */
        public Builder etlMetaKeyList(java.util.List < String > etlMetaKeyList) {
            this.putBodyParameter("etlMetaKeyList", etlMetaKeyList);
            this.etlMetaKeyList = etlMetaKeyList;
            return this;
        }

        /**
         * etlMetaName.
         */
        public Builder etlMetaName(String etlMetaName) {
            this.putBodyParameter("etlMetaName", etlMetaName);
            this.etlMetaName = etlMetaName;
            return this;
        }

        /**
         * 匹配的 tag，当 tag 为 "__all_etl_meta_tag_match__" 时表示全部匹配。
         */
        public Builder etlMetaTag(String etlMetaTag) {
            this.putBodyParameter("etlMetaTag", etlMetaTag);
            this.etlMetaTag = etlMetaTag;
            return this;
        }

        /**
         * 操作作用的范围，可选 all 代表匹配全部，list 按名单列表匹配 key 两种模式。
         */
        public Builder range(String range) {
            this.putBodyParameter("range", range);
            this.range = range;
            return this;
        }

        /**
         * 操作类型，支持启用、禁用、删除三种，即 batch_enable、batch_disable、batch_delete。
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public BatchModifyEtlMetaStatusRequest build() {
            return new BatchModifyEtlMetaStatusRequest(this);
        } 

    } 

}
