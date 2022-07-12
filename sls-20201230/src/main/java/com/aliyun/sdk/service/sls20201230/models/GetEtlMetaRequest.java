// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetEtlMetaRequest} extends {@link RequestModel}
 *
 * <p>GetEtlMetaRequest</p>
 */
public class GetEtlMetaRequest extends Request {
    @Query
    @NameInMap("elMetaName")
    @Validation(required = true)
    private String elMetaName;

    @Query
    @NameInMap("etlMetaKey")
    @Validation(required = true)
    private String etlMetaKey;

    @Query
    @NameInMap("etlMetaTag")
    @Validation(required = true)
    private String etlMetaTag;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private GetEtlMetaRequest(Builder builder) {
        super(builder);
        this.elMetaName = builder.elMetaName;
        this.etlMetaKey = builder.etlMetaKey;
        this.etlMetaTag = builder.etlMetaTag;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEtlMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elMetaName
     */
    public String getElMetaName() {
        return this.elMetaName;
    }

    /**
     * @return etlMetaKey
     */
    public String getEtlMetaKey() {
        return this.etlMetaKey;
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

    public static final class Builder extends Request.Builder<GetEtlMetaRequest, Builder> {
        private String elMetaName; 
        private String etlMetaKey; 
        private String etlMetaTag; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(GetEtlMetaRequest request) {
            super(request);
            this.elMetaName = request.elMetaName;
            this.etlMetaKey = request.etlMetaKey;
            this.etlMetaTag = request.etlMetaTag;
            this.project = request.project;
        } 

        /**
         * elMetaName.
         */
        public Builder elMetaName(String elMetaName) {
            this.putQueryParameter("elMetaName", elMetaName);
            this.elMetaName = elMetaName;
            return this;
        }

        /**
         * etlMetaKey.
         */
        public Builder etlMetaKey(String etlMetaKey) {
            this.putQueryParameter("etlMetaKey", etlMetaKey);
            this.etlMetaKey = etlMetaKey;
            return this;
        }

        /**
         * 此处固定为 "__all_etl_meta_tag_match__"。
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
        public GetEtlMetaRequest build() {
            return new GetEtlMetaRequest(this);
        } 

    } 

}
