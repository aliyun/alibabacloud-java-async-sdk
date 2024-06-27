// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVariableListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVariableListRequest</p>
 */
public class DescribeVariableListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("refObjId")
    private String refObjId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("typesStr")
    private String typesStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private DescribeVariableListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.createType = builder.createType;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.refObjId = builder.refObjId;
        this.regId = builder.regId;
        this.sourceType = builder.sourceType;
        this.type = builder.type;
        this.typesStr = builder.typesStr;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVariableListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return refObjId
     */
    public String getRefObjId() {
        return this.refObjId;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return typesStr
     */
    public String getTypesStr() {
        return this.typesStr;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<DescribeVariableListRequest, Builder> {
        private String lang; 
        private String createType; 
        private String currentPage; 
        private String pageSize; 
        private String refObjId; 
        private String regId; 
        private String sourceType; 
        private String type; 
        private String typesStr; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVariableListRequest request) {
            super(request);
            this.lang = request.lang;
            this.createType = request.createType;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.refObjId = request.refObjId;
            this.regId = request.regId;
            this.sourceType = request.sourceType;
            this.type = request.type;
            this.typesStr = request.typesStr;
            this.value = request.value;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * createType.
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
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
         * refObjId.
         */
        public Builder refObjId(String refObjId) {
            this.putQueryParameter("refObjId", refObjId);
            this.refObjId = refObjId;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * typesStr.
         */
        public Builder typesStr(String typesStr) {
            this.putQueryParameter("typesStr", typesStr);
            this.typesStr = typesStr;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.putQueryParameter("value", value);
            this.value = value;
            return this;
        }

        @Override
        public DescribeVariableListRequest build() {
            return new DescribeVariableListRequest(this);
        } 

    } 

}
