// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateVirusFileStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateVirusFileStatusRequest</p>
 */
public class UpdateVirusFileStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String devTag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileMd5")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileMd5;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VirusType")
    private String virusType;

    private UpdateVirusFileStatusRequest(Builder builder) {
        super(builder);
        this.devTag = builder.devTag;
        this.fileMd5 = builder.fileMd5;
        this.filePath = builder.filePath;
        this.operation = builder.operation;
        this.virusType = builder.virusType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVirusFileStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return devTag
     */
    public String getDevTag() {
        return this.devTag;
    }

    /**
     * @return fileMd5
     */
    public String getFileMd5() {
        return this.fileMd5;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return virusType
     */
    public String getVirusType() {
        return this.virusType;
    }

    public static final class Builder extends Request.Builder<UpdateVirusFileStatusRequest, Builder> {
        private String devTag; 
        private String fileMd5; 
        private String filePath; 
        private String operation; 
        private String virusType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVirusFileStatusRequest request) {
            super(request);
            this.devTag = request.devTag;
            this.fileMd5 = request.fileMd5;
            this.filePath = request.filePath;
            this.operation = request.operation;
            this.virusType = request.virusType;
        } 

        /**
         * <p>The unique identifier of the user terminal device where the virus file is located. The value can be up to 64 characters in length. You can obtain the value from the following operation:</p>
         * <ul>
         * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: lists virus file statuses.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        public Builder devTag(String devTag) {
            this.putBodyParameter("DevTag", devTag);
            this.devTag = devTag;
            return this;
        }

        /**
         * <p>The MD5 value of the virus file. The value must be a 32-character hexadecimal string. You can obtain the value from the following operation:</p>
         * <ul>
         * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: lists virus file statuses.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d41d8cd98f00b204e9800998ecf8427e</p>
         */
        public Builder fileMd5(String fileMd5) {
            this.putBodyParameter("FileMd5", fileMd5);
            this.fileMd5 = fileMd5;
            return this;
        }

        /**
         * <p>The absolute path of the virus file on the user terminal device. You can obtain the value from the following operation:</p>
         * <ul>
         * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: lists virus file statuses.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Users\Public\Downloads\setup.exe</p>
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>The disposal action. Valid values:</p>
         * <ul>
         * <li><strong>AdminQuarantine</strong>: quarantines the virus file. The server creates a disposal task and returns a TaskId. The user terminal device pulls and executes the quarantine.</li>
         * <li><strong>AdminTrust</strong>: trusts the virus file. Only the disposal status is updated. No disposal task is created, and TaskId returns an empty string.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AdminQuarantine</p>
         */
        public Builder operation(String operation) {
            this.putBodyParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * <p>The virus type. This parameter is used for synchronization to update the virus type of the file. Valid values:</p>
         * <ul>
         * <li><strong>Backdoor</strong>: backdoor program.</li>
         * <li><strong>DDoS</strong>: DDoS Trojan.</li>
         * <li><strong>Downloader</strong>: downloader Trojan.</li>
         * <li><strong>Engtest</strong>: DPI engine test program.</li>
         * <li><strong>Hacktool</strong>: hacker tool.</li>
         * <li><strong>Trojan</strong>: self-mutating Trojan.</li>
         * <li><strong>Malbaseware</strong>: contaminated base software.</li>
         * <li><strong>MalScript</strong>: malicious script.</li>
         * <li><strong>Malware</strong>: malicious program.</li>
         * <li><strong>Miner</strong>: mining programs.</li>
         * <li><strong>Proxytool</strong>: proxy tool.</li>
         * <li><strong>RansomWare</strong>: ransomware.</li>
         * <li><strong>RiskWare</strong>: riskware.</li>
         * <li><strong>Rootkit</strong>: kernel-hidden program.</li>
         * <li><strong>Stealer</strong>: credential stealer.</li>
         * <li><strong>Scanner</strong>: scanner.</li>
         * <li><strong>Suspicious</strong>: suspicious program.</li>
         * <li><strong>Virus</strong>: file-infecting virus.</li>
         * <li><strong>WebShell</strong>: webshell.</li>
         * <li><strong>Worm</strong>: worms.</li>
         * <li><strong>BlackList</strong>: file that hit a blacklist entry.</li>
         * <li><strong>Exp</strong>: vulnerability exploits program.</li>
         * <li><strong>Patcher</strong>: cracking program.</li>
         * <li><strong>Gametool</strong>: private server tool.</li>
         * <li><strong>AdWare</strong>: adware.</li>
         * <li><strong>Maldoc</strong>: malicious document.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Virus</p>
         */
        public Builder virusType(String virusType) {
            this.putBodyParameter("VirusType", virusType);
            this.virusType = virusType;
            return this;
        }

        @Override
        public UpdateVirusFileStatusRequest build() {
            return new UpdateVirusFileStatusRequest(this);
        } 

    } 

}
