// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeEventVariableListRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventVariableListRequest</p>
 */
public class DescribeEventVariableListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filterDTO")
    private String filterDTO;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("refObjId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String refObjId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("refObjType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String refObjType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private DescribeEventVariableListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.createType = builder.createType;
        this.filterDTO = builder.filterDTO;
        this.refObjId = builder.refObjId;
        this.refObjType = builder.refObjType;
        this.regId = builder.regId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventVariableListRequest create() {
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
     * @return filterDTO
     */
    public String getFilterDTO() {
        return this.filterDTO;
    }

    /**
     * @return refObjId
     */
    public String getRefObjId() {
        return this.refObjId;
    }

    /**
     * @return refObjType
     */
    public String getRefObjType() {
        return this.refObjType;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeEventVariableListRequest, Builder> {
        private String lang; 
        private String createType; 
        private String filterDTO; 
        private String refObjId; 
        private String refObjType; 
        private String regId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventVariableListRequest request) {
            super(request);
            this.lang = request.lang;
            this.createType = request.createType;
            this.filterDTO = request.filterDTO;
            this.refObjId = request.refObjId;
            this.refObjType = request.refObjType;
            this.regId = request.regId;
            this.type = request.type;
        } 

        /**
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. The values are: - <strong>zh</strong>: Chinese - <strong>en</strong>: English</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Create Type.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * <p>Filter object.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;type&quot;: &quot;EXPRESSION&quot;,
         *     &quot;name&quot;: &quot;ex_NgR6nDVD821c&quot;
         * }</p>
         */
        public Builder filterDTO(String filterDTO) {
            this.putQueryParameter("filterDTO", filterDTO);
            this.filterDTO = filterDTO;
            return this;
        }

        /**
         * <p>Associated event eventCode.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>de_awkhwh0314</p>
         */
        public Builder refObjId(String refObjId) {
            this.putQueryParameter("refObjId", refObjId);
            this.refObjId = refObjId;
            return this;
        }

        /**
         * <p>Association Type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EVENT</p>
         */
        public Builder refObjType(String refObjType) {
            this.putQueryParameter("refObjType", refObjType);
            this.refObjType = refObjType;
            return this;
        }

        /**
         * <p>Region Code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>type.</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeEventVariableListRequest build() {
            return new DescribeEventVariableListRequest(this);
        } 

    } 

}
