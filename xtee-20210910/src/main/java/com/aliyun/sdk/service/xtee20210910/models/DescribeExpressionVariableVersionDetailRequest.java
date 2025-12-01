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
 * {@link DescribeExpressionVariableVersionDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeExpressionVariableVersionDetailRequest</p>
 */
public class DescribeExpressionVariableVersionDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("objectCode")
    private String objectCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("objectId")
    private Long objectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("version")
    private Long version;

    private DescribeExpressionVariableVersionDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.objectCode = builder.objectCode;
        this.objectId = builder.objectId;
        this.regId = builder.regId;
        this.type = builder.type;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressionVariableVersionDetailRequest create() {
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
     * @return objectCode
     */
    public String getObjectCode() {
        return this.objectCode;
    }

    /**
     * @return objectId
     */
    public Long getObjectId() {
        return this.objectId;
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

    /**
     * @return version
     */
    public Long getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeExpressionVariableVersionDetailRequest, Builder> {
        private String lang; 
        private String objectCode; 
        private Long objectId; 
        private String regId; 
        private String type; 
        private Long version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExpressionVariableVersionDetailRequest request) {
            super(request);
            this.lang = request.lang;
            this.objectCode = request.objectCode;
            this.objectId = request.objectId;
            this.regId = request.regId;
            this.type = request.type;
            this.version = request.version;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
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
         * <p>Associated variable code.</p>
         * 
         * <strong>example:</strong>
         * <p>ex_0kWIfZ27c525</p>
         */
        public Builder objectCode(String objectCode) {
            this.putQueryParameter("objectCode", objectCode);
            this.objectCode = objectCode;
            return this;
        }

        /**
         * <p>Associated variable primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>397625</p>
         */
        public Builder objectId(Long objectId) {
            this.putQueryParameter("objectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>Region code.</p>
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
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPRESSION</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>Version number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder version(Long version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public DescribeExpressionVariableVersionDetailRequest build() {
            return new DescribeExpressionVariableVersionDetailRequest(this);
        } 

    } 

}
