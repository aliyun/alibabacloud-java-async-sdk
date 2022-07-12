// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link DeleteEtlMetaRequest} extends {@link RequestModel}
 *
 * <p>DeleteEtlMetaRequest</p>
 */
public class DeleteEtlMetaRequest extends Request {
    @Query
    @NameInMap("etlMetaKey")
    @Validation(required = true)
    private String etlMetaKey;

    @Query
    @NameInMap("etlMetaName")
    @Validation(required = true)
    private String etlMetaName;

    @Query
    @NameInMap("etlMetaTag")
    @Validation(required = true)
    private String etlMetaTag;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private DeleteEtlMetaRequest(Builder builder) {
        super(builder);
        this.etlMetaKey = builder.etlMetaKey;
        this.etlMetaName = builder.etlMetaName;
        this.etlMetaTag = builder.etlMetaTag;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEtlMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return etlMetaKey
     */
    public String getEtlMetaKey() {
        return this.etlMetaKey;
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
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<DeleteEtlMetaRequest, Builder> {
        private String etlMetaKey; 
        private String etlMetaName; 
        private String etlMetaTag; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEtlMetaRequest request) {
            super(request);
            this.etlMetaKey = request.etlMetaKey;
            this.etlMetaName = request.etlMetaName;
            this.etlMetaTag = request.etlMetaTag;
            this.project = request.project;
        } 

        /**
         * key。由 ascii 可打印字符组成，包括数字、英文大小写字母、下划线、连字符、英文标点符号等组成，长度在[1,255]之间。
         */
        public Builder etlMetaKey(String etlMetaKey) {
            this.putQueryParameter("etlMetaKey", etlMetaKey);
            this.etlMetaKey = etlMetaKey;
            return this;
        }

        /**
         * 名字。由数字、大小写字母、下划线_、连字符-组成，长度需要在[2,64]之间。
         * <p>
         * 
         */
        public Builder etlMetaName(String etlMetaName) {
            this.putQueryParameter("etlMetaName", etlMetaName);
            this.etlMetaName = etlMetaName;
            return this;
        }

        /**
         * 此处固定为 "__all_etl_meta_tag_match__"
         */
        public Builder etlMetaTag(String etlMetaTag) {
            this.putQueryParameter("etlMetaTag", etlMetaTag);
            this.etlMetaTag = etlMetaTag;
            return this;
        }

        /**
         * A short description of struct
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public DeleteEtlMetaRequest build() {
            return new DeleteEtlMetaRequest(this);
        } 

    } 

}
