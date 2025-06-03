// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link GetRandomPasswordRequest} extends {@link RequestModel}
 *
 * <p>GetRandomPasswordRequest</p>
 */
public class GetRandomPasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeCharacters")
    private String excludeCharacters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeLowercase")
    private String excludeLowercase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeNumbers")
    private String excludeNumbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludePunctuation")
    private String excludePunctuation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeUppercase")
    private String excludeUppercase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordLength")
    private String passwordLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequireEachIncludedType")
    private String requireEachIncludedType;

    private GetRandomPasswordRequest(Builder builder) {
        super(builder);
        this.excludeCharacters = builder.excludeCharacters;
        this.excludeLowercase = builder.excludeLowercase;
        this.excludeNumbers = builder.excludeNumbers;
        this.excludePunctuation = builder.excludePunctuation;
        this.excludeUppercase = builder.excludeUppercase;
        this.passwordLength = builder.passwordLength;
        this.requireEachIncludedType = builder.requireEachIncludedType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRandomPasswordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return excludeCharacters
     */
    public String getExcludeCharacters() {
        return this.excludeCharacters;
    }

    /**
     * @return excludeLowercase
     */
    public String getExcludeLowercase() {
        return this.excludeLowercase;
    }

    /**
     * @return excludeNumbers
     */
    public String getExcludeNumbers() {
        return this.excludeNumbers;
    }

    /**
     * @return excludePunctuation
     */
    public String getExcludePunctuation() {
        return this.excludePunctuation;
    }

    /**
     * @return excludeUppercase
     */
    public String getExcludeUppercase() {
        return this.excludeUppercase;
    }

    /**
     * @return passwordLength
     */
    public String getPasswordLength() {
        return this.passwordLength;
    }

    /**
     * @return requireEachIncludedType
     */
    public String getRequireEachIncludedType() {
        return this.requireEachIncludedType;
    }

    public static final class Builder extends Request.Builder<GetRandomPasswordRequest, Builder> {
        private String excludeCharacters; 
        private String excludeLowercase; 
        private String excludeNumbers; 
        private String excludePunctuation; 
        private String excludeUppercase; 
        private String passwordLength; 
        private String requireEachIncludedType; 

        private Builder() {
            super();
        } 

        private Builder(GetRandomPasswordRequest request) {
            super(request);
            this.excludeCharacters = request.excludeCharacters;
            this.excludeLowercase = request.excludeLowercase;
            this.excludeNumbers = request.excludeNumbers;
            this.excludePunctuation = request.excludePunctuation;
            this.excludeUppercase = request.excludeUppercase;
            this.passwordLength = request.passwordLength;
            this.requireEachIncludedType = request.requireEachIncludedType;
        } 

        /**
         * <p>The characters that are not included in the password to be generated.</p>
         * <p>Valid values:</p>
         * <p><code>Valid characters: 0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ! \&quot;#$%&amp;\&quot;()*+,-. /:;&lt;=&gt;? @[\] your_project_id} ~ </code>.</p>
         * <p>This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>ABCabc</p>
         */
        public Builder excludeCharacters(String excludeCharacters) {
            this.putQueryParameter("ExcludeCharacters", excludeCharacters);
            this.excludeCharacters = excludeCharacters;
            return this;
        }

        /**
         * <p>Specifies whether to exclude lowercase letters.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder excludeLowercase(String excludeLowercase) {
            this.putQueryParameter("ExcludeLowercase", excludeLowercase);
            this.excludeLowercase = excludeLowercase;
            return this;
        }

        /**
         * <p>Specifies whether to exclude digits.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder excludeNumbers(String excludeNumbers) {
            this.putQueryParameter("ExcludeNumbers", excludeNumbers);
            this.excludeNumbers = excludeNumbers;
            return this;
        }

        /**
         * <p>Specifies whether to exclude special characters.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder excludePunctuation(String excludePunctuation) {
            this.putQueryParameter("ExcludePunctuation", excludePunctuation);
            this.excludePunctuation = excludePunctuation;
            return this;
        }

        /**
         * <p>Specifies whether to exclude uppercase letters.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder excludeUppercase(String excludeUppercase) {
            this.putQueryParameter("ExcludeUppercase", excludeUppercase);
            this.excludeUppercase = excludeUppercase;
            return this;
        }

        /**
         * <p>The number of bytes that the password to be generated contains.</p>
         * <p>Valid values: 8 to 128.</p>
         * <p>Default value: 32</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder passwordLength(String passwordLength) {
            this.putQueryParameter("PasswordLength", passwordLength);
            this.passwordLength = passwordLength;
            return this;
        }

        /**
         * <p>Specifies whether to include all the preceding character types.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder requireEachIncludedType(String requireEachIncludedType) {
            this.putQueryParameter("RequireEachIncludedType", requireEachIncludedType);
            this.requireEachIncludedType = requireEachIncludedType;
            return this;
        }

        @Override
        public GetRandomPasswordRequest build() {
            return new GetRandomPasswordRequest(this);
        } 

    } 

}
