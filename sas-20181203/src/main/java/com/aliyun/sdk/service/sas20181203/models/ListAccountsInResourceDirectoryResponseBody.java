// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListAccountsInResourceDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccountsInResourceDirectoryResponseBody</p>
 */
public class ListAccountsInResourceDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private java.util.List<Accounts> accounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAccountsInResourceDirectoryResponseBody(Builder builder) {
        this.accounts = builder.accounts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountsInResourceDirectoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accounts
     */
    public java.util.List<Accounts> getAccounts() {
        return this.accounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Accounts> accounts; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAccountsInResourceDirectoryResponseBody model) {
            this.accounts = model.accounts;
            this.requestId = model.requestId;
        } 

        /**
         * <p>La liste des comptes membres dans le répertoire de ressources.</p>
         */
        public Builder accounts(java.util.List<Accounts> accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * <p>L\&quot;identifiant de la requête. Il s\&quot;agit d\&quot;un identifiant unique généré par Alibaba Cloud pour la requête. Vous pouvez l\&quot;utiliser pour le dépannage.</p>
         * 
         * <strong>example:</strong>
         * <p>B7A839E8-70AE-591D-8D9E-C5419A2240DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccountsInResourceDirectoryResponseBody build() {
            return new ListAccountsInResourceDirectoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccountsInResourceDirectoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccountsInResourceDirectoryResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("BuySas")
        @Deprecated
        private Integer buySas;

        @com.aliyun.core.annotation.NameInMap("BuySasNew")
        private Boolean buySasNew;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private Integer chargeType;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("InstanceBuyType")
        private Integer instanceBuyType;

        @com.aliyun.core.annotation.NameInMap("IsMaAccount")
        private String isMaAccount;

        @com.aliyun.core.annotation.NameInMap("IsMarked")
        private String isMarked;

        @com.aliyun.core.annotation.NameInMap("IsSasDaAccount")
        private String isSasDaAccount;

        @com.aliyun.core.annotation.NameInMap("IsSiemControlAccount")
        private String isSiemControlAccount;

        @com.aliyun.core.annotation.NameInMap("IsSiemDaAccount")
        private String isSiemDaAccount;

        @com.aliyun.core.annotation.NameInMap("PostBasicService")
        private Integer postBasicService;

        @com.aliyun.core.annotation.NameInMap("PostPayModuleSwitch")
        private String postPayModuleSwitch;

        @com.aliyun.core.annotation.NameInMap("SaleInstance")
        private String saleInstance;

        @com.aliyun.core.annotation.NameInMap("SasVersion")
        private String sasVersion;

        private Accounts(Builder builder) {
            this.accountId = builder.accountId;
            this.buySas = builder.buySas;
            this.buySasNew = builder.buySasNew;
            this.chargeType = builder.chargeType;
            this.displayName = builder.displayName;
            this.folderId = builder.folderId;
            this.instanceBuyType = builder.instanceBuyType;
            this.isMaAccount = builder.isMaAccount;
            this.isMarked = builder.isMarked;
            this.isSasDaAccount = builder.isSasDaAccount;
            this.isSiemControlAccount = builder.isSiemControlAccount;
            this.isSiemDaAccount = builder.isSiemDaAccount;
            this.postBasicService = builder.postBasicService;
            this.postPayModuleSwitch = builder.postPayModuleSwitch;
            this.saleInstance = builder.saleInstance;
            this.sasVersion = builder.sasVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return buySas
         */
        public Integer getBuySas() {
            return this.buySas;
        }

        /**
         * @return buySasNew
         */
        public Boolean getBuySasNew() {
            return this.buySasNew;
        }

        /**
         * @return chargeType
         */
        public Integer getChargeType() {
            return this.chargeType;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        /**
         * @return instanceBuyType
         */
        public Integer getInstanceBuyType() {
            return this.instanceBuyType;
        }

        /**
         * @return isMaAccount
         */
        public String getIsMaAccount() {
            return this.isMaAccount;
        }

        /**
         * @return isMarked
         */
        public String getIsMarked() {
            return this.isMarked;
        }

        /**
         * @return isSasDaAccount
         */
        public String getIsSasDaAccount() {
            return this.isSasDaAccount;
        }

        /**
         * @return isSiemControlAccount
         */
        public String getIsSiemControlAccount() {
            return this.isSiemControlAccount;
        }

        /**
         * @return isSiemDaAccount
         */
        public String getIsSiemDaAccount() {
            return this.isSiemDaAccount;
        }

        /**
         * @return postBasicService
         */
        public Integer getPostBasicService() {
            return this.postBasicService;
        }

        /**
         * @return postPayModuleSwitch
         */
        public String getPostPayModuleSwitch() {
            return this.postPayModuleSwitch;
        }

        /**
         * @return saleInstance
         */
        public String getSaleInstance() {
            return this.saleInstance;
        }

        /**
         * @return sasVersion
         */
        public String getSasVersion() {
            return this.sasVersion;
        }

        public static final class Builder {
            private String accountId; 
            private Integer buySas; 
            private Boolean buySasNew; 
            private Integer chargeType; 
            private String displayName; 
            private String folderId; 
            private Integer instanceBuyType; 
            private String isMaAccount; 
            private String isMarked; 
            private String isSasDaAccount; 
            private String isSiemControlAccount; 
            private String isSiemDaAccount; 
            private Integer postBasicService; 
            private String postPayModuleSwitch; 
            private String saleInstance; 
            private String sasVersion; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.accountId = model.accountId;
                this.buySas = model.buySas;
                this.buySasNew = model.buySasNew;
                this.chargeType = model.chargeType;
                this.displayName = model.displayName;
                this.folderId = model.folderId;
                this.instanceBuyType = model.instanceBuyType;
                this.isMaAccount = model.isMaAccount;
                this.isMarked = model.isMarked;
                this.isSasDaAccount = model.isSasDaAccount;
                this.isSiemControlAccount = model.isSiemControlAccount;
                this.isSiemDaAccount = model.isSiemDaAccount;
                this.postBasicService = model.postBasicService;
                this.postPayModuleSwitch = model.postPayModuleSwitch;
                this.saleInstance = model.saleInstance;
                this.sasVersion = model.sasVersion;
            } 

            /**
             * <p>L\&quot;identifiant de compte Alibaba Cloud du membre.</p>
             * 
             * <strong>example:</strong>
             * <p>180803538814****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>Ce paramètre est obsolète et ne doit plus être utilisé.</p>
             * 
             * <strong>example:</strong>
             * <p>true.</p>
             */
            public Builder buySas(Integer buySas) {
                this.buySas = buySas;
                return this;
            }

            /**
             * <p>Indique si une instance Security Center en abonnement a été souscrite. Valeurs valides :</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true.</p>
             */
            public Builder buySasNew(Boolean buySasNew) {
                this.buySasNew = buySasNew;
                return this;
            }

            /**
             * <p>Le mode de facturation de l\&quot;abonnement. Valeurs valides :</p>
             * <ul>
             * <li><strong>0</strong> : prépayé</li>
             * <li><strong>1</strong> : paiement à l\&quot;usage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chargeType(Integer chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>Le nom du compte.</p>
             * 
             * <strong>example:</strong>
             * <p>abc**</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>L\&quot;identifiant du dossier dans le répertoire de ressources.</p>
             * 
             * <strong>example:</strong>
             * <p>fd-cE2SQP****</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>Le type d\&quot;achat de l\&quot;instance. Valeurs valides :</p>
             * <ul>
             * <li><strong>0</strong> : achat direct</li>
             * <li><strong>1</strong> : alloué via la gestion multi-comptes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder instanceBuyType(Integer instanceBuyType) {
                this.instanceBuyType = instanceBuyType;
                return this;
            }

            /**
             * <p>Indique si le compte est le compte de gestion du répertoire de ressources. Valeurs valides :</p>
             * <ul>
             * <li><p><strong>yes</strong></p>
             * </li>
             * <li><p><strong>no</strong>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isMaAccount(String isMaAccount) {
                this.isMaAccount = isMaAccount;
                return this;
            }

            /**
             * <p>Indique si le compte est marqué comme suivi.</p>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isMarked(String isMarked) {
                this.isMarked = isMarked;
                return this;
            }

            /**
             * <p>Indique si le compte est un compte administrateur délégué de Security Center. Valeurs valides :</p>
             * <ul>
             * <li><p><strong>yes</strong></p>
             * </li>
             * <li><p><strong>no</strong>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isSasDaAccount(String isSasDaAccount) {
                this.isSasDaAccount = isSasDaAccount;
                return this;
            }

            /**
             * <p>Indique si le compte est un compte de gestion de Cloud Threat Detection and Response (CTDR). Valeurs valides :</p>
             * <ul>
             * <li><p><strong>yes</strong></p>
             * </li>
             * <li><p><strong>no</strong>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isSiemControlAccount(String isSiemControlAccount) {
                this.isSiemControlAccount = isSiemControlAccount;
                return this;
            }

            /**
             * <p>Indique si le compte est un compte administrateur délégué de Cloud Threat Detection and Response (CTDR). Valeurs valides :</p>
             * <ul>
             * <li><p><strong>yes</strong></p>
             * </li>
             * <li><p><strong>no</strong>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isSiemDaAccount(String isSiemDaAccount) {
                this.isSiemDaAccount = isSiemDaAccount;
                return this;
            }

            /**
             * <p>Le commutateur de module à paiement à l\&quot;usage. Valeurs valides :</p>
             * <ul>
             * <li><strong>0</strong> : désactivé</li>
             * <li><strong>1</strong> : activé.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder postBasicService(Integer postBasicService) {
                this.postBasicService = postBasicService;
                return this;
            }

            /**
             * <p>L\&quot;état des commutateurs de modules à paiement à l\&quot;usage, au format JsonString. Valeurs valides :</p>
             * <ul>
             * <li>Clé :<ul>
             * <li><strong>VUL</strong> : module de gestion des vulnérabilités</li>
             * <li><strong>CSPM</strong> : module Cloud Security Posture Management (CSPM)</li>
             * <li><strong>AGENTLESS</strong> : module de détection sans agent</li>
             * <li><strong>SERVERLESS</strong> : module de ressources serverless</li>
             * <li><strong>CTDR</strong> : module Cloud Threat Detection and Response (CTDR)</li>
             * <li><strong>RASP</strong> : module Runtime Application Self-Protection (RASP)</li>
             * <li><strong>SDK</strong> : module SDK de détection de fichiers malveillants</li>
             * <li><strong>POST_HOST</strong> : module de sécurité des hôtes et des conteneurs</li>
             * </ul>
             * </li>
             * <li>Valeur : 0 indique désactivé. 1 indique activé.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;VUL\&quot;:0}</p>
             */
            public Builder postPayModuleSwitch(String postPayModuleSwitch) {
                this.postPayModuleSwitch = postPayModuleSwitch;
                return this;
            }

            /**
             * <p>L\&quot;identifiant de l\&quot;instance Security Center.</p>
             * 
             * <strong>example:</strong>
             * <p>postpay-sas-x5x3hy1ly***</p>
             */
            public Builder saleInstance(String saleInstance) {
                this.saleInstance = saleInstance;
                return this;
            }

            /**
             * <p>L\&quot;édition souscrite de Security Center. Valeurs valides :</p>
             * <ul>
             * <li><strong>0</strong> ou <strong>1</strong> : Édition gratuite</li>
             * <li><strong>2</strong> ou <strong>3</strong> : Édition Enterprise  </li>
             * <li><strong>5</strong> : Édition Premium  </li>
             * <li><strong>6</strong> : Édition Anti-virus </li>
             * <li><strong>7</strong> : Édition Ultimate.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sasVersion(String sasVersion) {
                this.sasVersion = sasVersion;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
