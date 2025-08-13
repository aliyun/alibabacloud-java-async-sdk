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
 * {@link DescribeVariableBindDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeVariableBindDetailRequest</p>
 */
public class DescribeVariableBindDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("defineId")
    private Long defineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeVariableBindDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.defineId = builder.defineId;
        this.id = builder.id;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVariableBindDetailRequest create() {
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
     * @return defineId
     */
    public Long getDefineId() {
        return this.defineId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeVariableBindDetailRequest, Builder> {
        private String lang; 
        private Long defineId; 
        private Long id; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVariableBindDetailRequest request) {
            super(request);
            this.lang = request.lang;
            this.defineId = request.defineId;
            this.id = request.id;
            this.regId = request.regId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
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
         * <p>Bound variable definition ID</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder defineId(Long defineId) {
            this.putQueryParameter("defineId", defineId);
            this.defineId = defineId;
            return this;
        }

        /**
         * <p>Primary key ID of the variable, which is empty if it&quot;s a new addition</p>
         * 
         * <strong>example:</strong>
         * <p>3144</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeVariableBindDetailRequest build() {
            return new DescribeVariableBindDetailRequest(this);
        } 

    } 

}
