// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.kms20160120.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
      * This operation supports only asymmetric keys for which the **Usage** parameter is set to **ENCRYPT/DECRYPT**. The following table lists supported encryption algorithms. 
      * | KeySpec | Algorithm | Description | Maximum length in bytes |
      * | ------- | --------- | ----------- | ----------------------- |
      * | RSA_2048 | RSAES_OAEP_SHA_256 | RSAES-OAEP using SHA-256 and MGF1 with SHA-256 | 256 |
      * | RSA_2048 | RSAES_OAEP_SHA_1 | RSAES-OAEP using SHA1 and MGF1 with SHA1 | 256 |
      * | RSA_3072 | RSAES_OAEP_SHA_256 | RSAES-OAEP using SHA-256 and MGF1 with SHA-256 | 384 |
      * | RSA_3072 | RSAES_OAEP_SHA_1 | RSAES-OAEP using SHA1 and MGF1 with SHA1 | 384 |
      * | EC_SM2 | SM2PKE | SM2 public key encryption algorithm based on elliptic curves | 6144 |
      * In this example, the asymmetric key whose ID is `5c438b18-05be-40ad-b6c2-3be6752c****` and version ID is `2ab1a983-7072-4bbc-a582-584b5bd8****` and the decryption algorithm `RSAES_OAEP_SHA_1` are used to decrypt the ciphertext `BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVsv1W****==`.
      *
     */
    CompletableFuture<AsymmetricDecryptResponse> asymmetricDecrypt(AsymmetricDecryptRequest request);

    /**
      * This operation is supported only for asymmetric keys for which the **Usage** parameter is set to **ENCRYPT/DECRYPT**. The following table lists the supported encryption algorithms: 
      * | KeySpec | Algorithm | Description | Maximum number of bytes that can be encrypted |
      * | ------- | --------- | ----------- | --------------------------------------------- |
      * | RSA_2048 | RSAES_OAEP_SHA_256 | RSAES-OAEP using SHA-256 and MGF1 with SHA-256 | 190 |
      * | RSA_2048 | RSAES_OAEP_SHA_1 | RSAES-OAEP using SHA1 and MGF1 with SHA1 | 214 |
      * | RSA_3072 | RSAES_OAEP_SHA_256 | RSAES-OAEP using SHA-256 and MGF1 with SHA-256 | 318 |
      * | RSA_3072 | RSAES_OAEP_SHA_1 | RSAES-OAEP using SHA1 and MGF1 with SHA1 | 342 |
      * | EC_SM2 | SM2PKE | SM2 public key encryption algorithm based on elliptic curves | 6047 |
      * You can use the asymmetric CMK whose ID is `5c438b18-05be-40ad-b6c2-3be6752c****` and version ID is `2ab1a983-7072-4bbc-a582-584b5bd8****` and the algorithm `RSAES_OAEP_SHA_1` to encrypt the plaintext `SGVsbG8gd29ybGQ=` based on the parameter settings provided in this topic.
      *
     */
    CompletableFuture<AsymmetricEncryptResponse> asymmetricEncrypt(AsymmetricEncryptRequest request);

    /**
      * Generates a signature by using an asymmetric key.
      *
     */
    CompletableFuture<AsymmetricSignResponse> asymmetricSign(AsymmetricSignRequest request);

    /**
      * This operation supports only asymmetric keys for which the **Usage** parameter is set to **SIGN/VERIFY**. The following table describes the supported signature algorithms. 
      * | KeySpec | Algorithm | Description |
      * | ------- | --------- | ----------- |
      * | RSA_2048 | RSA_PSS_SHA_256 | RSASSA-PSS using SHA-256 and MGF1 with SHA-256 |
      * | RSA_2048 | RSA_PKCS1_SHA_256 | RSASSA-PKCS1-v1_5 using SHA-256 |
      * | RSA_3072 | RSA_PSS_SHA_256 | RSASSA-PSS using SHA-256 and MGF1 with SHA-256 |
      * | RSA_3072 | RSA_PKCS1_SHA_256 | RSASSA-PKCS1-v1_5 using SHA-256 |
      * | EC_P256 | ECDSA_SHA_256 | ECDSA on the P-256 Curve(secp256r1) with a SHA-256 digest |
      * | EC_P256K | ECDSA_SHA_256 | ECDSA on the P-256K Curve(secp256k1) with a SHA-256 digest |
      * | EC_SM2 | SM2DSA | SM2 elliptic curve public key encryption algorithm |
      * >  When you calculate the SM2 signature based on GB/T 32918, the **Digest** parameter is used to calculate the digest value of the combination of Z(A) and M, rather than the SM3 digest value. M indicates the original message to be signed. Z(A) indicates the hash value for User A. The hash value is defined in GB/T 32918.  In this example, the asymmetric key whose ID is `5c438b18-05be-40ad-b6c2-3be6752c****` and version ID is `2ab1a983-7072-4bbc-a582-584b5bd8****` and the signature algorithm RSA_PSS_SHA_256 are used to verify the signature `M2CceNZH00ZgL9ED/ZHFp21YRAvYeZHknJUc207OCZ0N9wNn9As4z2bON3FF3je+1Nu+2+/8Zj50HpMTpzYpMp2R93cYmACCmhaYoKydxylbyGzJR8y9likZRCrkD38lRoS40aBBvv/6iRKzQuo9EGYVcel36cMNg00VmYNBy3pa1rwg3gA4l3cy6kjayZja1WGPkVhrVKsrJMdbpl0ApLjXKuD8rw1n1XLCwCUEL5eLPljTZaAveqdOFQOiZnZEGI27qIiZe7I1fN8tcz6anS/gTM7xRKE++5egEvRWlTQQTJeApnPSiUPA+8ZykNdelQsOQh5SrGoyI4A5pq****==` of the digest `ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuyjfzw=`.
      *
     */
    CompletableFuture<AsymmetricVerifyResponse> asymmetricVerify(AsymmetricVerifyRequest request);

    /**
      * If the deletion task of a CMK is canceled, the CMK returns to the Enabled state.
      *
     */
    CompletableFuture<CancelKeyDeletionResponse> cancelKeyDeletion(CancelKeyDeletionRequest request);

    /**
      * Limit: The encryption algorithm in the request parameters must match the key type. 
      * The following table describes the mapping between encryption algorithms and key types.
      * | Algorithm | Key Spec |
      * | --------- | -------- |
      * | RSAES_OAEP_SHA_1 | RSA_2048 |
      * | RSAES_OAEP_SHA_256 | RSA_2048 |
      * | SM2PKE | EC_SM2 |
      * In this example, the certificate whose ID is `12345678-1234-1234-1234-12345678****` and the encryption algorithm `RSAES_OAEP_SHA_256` are used to decrypt the data `ZOyIygCyaOW6Gj****MlNKiuyjfzw=`.
      *
     */
    CompletableFuture<CertificatePrivateKeyDecryptResponse> certificatePrivateKeyDecrypt(CertificatePrivateKeyDecryptRequest request);

    /**
      * The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  
      * | Algorithm | Key Spec |
      * | --------- | -------- |
      * | RSA_PKCS1_SHA_256 | RSA_2048 |
      * | RSA_PSS_SHA_256 | RSA_2048 |
      * | ECDSA_SHA_256 | EC_P256 |
      * | SM2DSA | EC_SM2 |
      * In this example, the certificate whose ID is `12345678-1234-1234-1234-12345678****` and the signature algorithm `ECDSA_SHA_256` are used to generate a signature for the raw data `VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=`.
      *
     */
    CompletableFuture<CertificatePrivateKeySignResponse> certificatePrivateKeySign(CertificatePrivateKeySignRequest request);

    /**
      * Limit: The encryption algorithm in the request parameters must match the key type. 
      * The following table describes the mapping between encryption algorithms and key types.
      * | Algorithm | Key Spec |
      * | --------- | -------- |
      * | RSAES_OAEP_SHA_1 | RSA_2048 |
      * | RSAES_OAEP_SHA_256 | RSA_2048 |
      * | SM2PKE | EC_SM2 |
      * In this example, the certificate whose ID is `12345678-1234-1234-1234-12345678****` and the encryption algorithm `RSAES_OAEP_SHA_256` are used to encrypt the data `VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=`.
      *
     */
    CompletableFuture<CertificatePublicKeyEncryptResponse> certificatePublicKeyEncrypt(CertificatePublicKeyEncryptRequest request);

    /**
      * The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  
      * | Algorithm | Key Spec |
      * | --------- | -------- |
      * | RSA_PKCS1_SHA_256 | RSA_2048 |
      * | RSA_PSS_SHA_256 | RSA_2048 |
      * | ECDSA_SHA_256 | EC_P256 |
      * | SM2DSA | EC_SM2 |
      * In this example, the certificate whose ID is `12345678-1234-1234-1234-12345678****` and the signature algorithm `ECDSA_SHA_256` are used to verify the digital signature `ZOyIygCyaOW6Gj****MlNKiuyjfzw=` of the raw data `VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=`.
      *
     */
    CompletableFuture<CertificatePublicKeyVerifyResponse> certificatePublicKeyVerify(CertificatePublicKeyVerifyRequest request);

    /**
      * *   Each alias can be bound to only one CMK at a time.
      * *   The aliases of CMKs in the same region must be unique.
      * In this topic, an alias named `alias/example` is created for a CMK named `7906979c-8e06-46a2-be2d-68e3ccbc****`.
      *
     */
    CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request);

    /**
      * To create a certificate, you must specify the type of the asymmetric key. Certificates Manager generates a private key and returns a certificate signing request (CSR). Submit the CSR in the Privacy Enhanced Mail (PEM) format to a certificate authority (CA) to obtain the formal certificate and certificate chain. Then, call the [UploadCertificate](~~212136~~) operation to import the certificate into Certificates Manager.
      * In this example, a certificate is created and the CSR is obtained.
      *
     */
    CompletableFuture<CreateCertificateResponse> createCertificate(CreateCertificateRequest request);

    /**
      * Creates a customer master key (CMK).
      *
     */
    CompletableFuture<CreateKeyResponse> createKey(CreateKeyRequest request);

    /**
      * *   You can create a version only for an asymmetric CMK that is in the Enabled state. You can call the [CreateKey](~~28947~~) operation to create an asymmetric CMK and the [DescribeKey](~~28952~~) operation to query the status of the CMK. The status is specified by the KeyState parameter.
      * *   The minimum interval for creating a version of the same CMK is seven days. You can call the [DescribeKey](~~28952~~) operation to query the time when the last version of a CMK was created. The time is specified by the LastRotationDate parameter.
      * *   If a CMK is in a private key store, you cannot create a version for the CMK.
      * *   You can create a maximum of 50 versions for a CMK in the same region.
      * You can create a version for the CMK whose ID is `0b30658a-ed1a-4922-b8f7-a673ca9c****` by using the parameter settings provided in this topic.
      *
     */
    CompletableFuture<CreateKeyVersionResponse> createKeyVersion(CreateKeyVersionRequest request);

    /**
      * The name of the secret.
      * The value must be 1 to 64 characters in length and can contain letters, digits, underscores (\\_), forward slashes (/), plus signs (+), equal signs (=), periods (.), hyphens (-), and at signs (@). The following list describes the name requirements for different types of secrets:
      * *   If the SecretType parameter is set to Generic or Rds, the name cannot start with `acs/`.
      * *   If the SecretType parameter is set to RAMCredentials, set the SecretName parameter to `$Auto`. In this case, KMS automatically generates a secret name that starts with `acs/ram/user/`. The name includes the display name of RAM user.
      * *   If the SecretType parameter is set to ECS, the name must start with `acs/ecs/`.
      *
     */
    CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request);

    CompletableFuture<DecryptResponse> decrypt(DecryptRequest request);

    CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request);

    /**
      * After the certificate and its private key and certificate chain are deleted, they cannot be restored. Proceed with caution.
      * In this example, the certificate whose ID is `9a28de48-8d8b-484d-a766-dec4****` and its private key and certificate chain are deleted.
      *
     */
    CompletableFuture<DeleteCertificateResponse> deleteCertificate(DeleteCertificateRequest request);

    /**
      * This operation does not delete the CMK that is created by using the key material.
      * If the CMK is in the PendingDeletion state, the state of the CMK and the scheduled deletion time do not change after you call this operation. If the CMK is not in the PendingDeletion state, the state of the CMK changes to PendingImport after you call this operation.
      * After you delete the key material, you can upload only the same key material into the CMK.
      *
     */
    CompletableFuture<DeleteKeyMaterialResponse> deleteKeyMaterial(DeleteKeyMaterialRequest request);

    /**
      * If you call this operation without specifying a recovery period, the deleted secret can be recovered within 30 days.
      * If you specify a recovery period, the deleted secret can be recovered within the recovery period. You can also forcibly delete a secret. A forcibly deleted secret cannot be recovered.
      *
     */
    CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request);

    CompletableFuture<DescribeAccountKmsStatusResponse> describeAccountKmsStatus(DescribeAccountKmsStatusRequest request);

    /**
      * In this example, the information about the certificate whose ID is `9a28de48-8d8b-484d-a766-dec4****` is queried. The certificate information includes the certificate ID, creation time, certificate issuer, validity period, serial number, and signature algorithm.
      *
     */
    CompletableFuture<DescribeCertificateResponse> describeCertificate(DescribeCertificateRequest request);

    /**
      * You can query the information about the CMK `05754286-3ba2-4fa6-8d41-4323aca6****` by using parameter settings provided in this topic. The information includes the creator, creation time, status, and deletion protection status of the CMK.
      *
     */
    CompletableFuture<DescribeKeyResponse> describeKey(DescribeKeyRequest request);

    /**
      * This topic provides an example on how to query the information about a version of the CMK `1234abcd-12ab-34cd-56ef-12345678****`. The ID of the CMK version is `2ab1a983-7072-4bbc-a582-584b5bd8****`. The response shows that the creation time of the CMK version is `2016-03-25T10:42:40Z`.
      *
     */
    CompletableFuture<DescribeKeyVersionResponse> describeKeyVersion(DescribeKeyVersionRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * This operation returns the metadata of a secret. This operation does not return the secret value.
      * In this example, the metadata of the secret named `secret001` is queried.
      *
     */
    CompletableFuture<DescribeSecretResponse> describeSecret(DescribeSecretRequest request);

    /**
      * If a customer master key (CMK) is disabled, the ciphertext encrypted by using this CMK cannot be decrypted until you re-enable it. You can call the [EnableKey](~~35150~~) operation to enable the CMK.
      * In this example, the CMK whose ID is `1234abcd-12ab-34cd-56ef-12345678****` is disabled.
      *
     */
    CompletableFuture<DisableKeyResponse> disableKey(DisableKeyRequest request);

    CompletableFuture<EnableKeyResponse> enableKey(EnableKeyRequest request);

    /**
      * *   KMS uses the primary version of a specified CMK to encrypt data.
      * *   Only data of 6 KB or less can be encrypted. For example, you can call this operation to encrypt RSA keys, database access passwords, or other sensitive information.
      * *   When you migrate encrypted data across regions, you can call this operation in the destination region to encrypt the plaintext of the data key that is used to encrypt the migrated data in the source region. This way, the ciphertext of the data key is generated in the destination region. You can also call the [Decrypt](~~28950~~) operation to decrypt the data key.
      *
     */
    CompletableFuture<EncryptResponse> encrypt(EncryptRequest request);

    /**
      * You can call the [GenerateDataKeyWithoutPlaintext](~~134043~~) operation to generate a data key, which is encrypted by a CMK. If you want to distribute the data key to other regions or cryptographic modules, you can call the ExportDataKey operation to use a public key to encrypt the data key.
      * Then, you can import the ciphertext of the data key to the cryptographic module where the private key is stored. This way, the data key is securely distributed from KMS to the cryptographic module. After the data key is imported to the cryptographic module, you can use it to encrypt or decrypt data.
      *
     */
    CompletableFuture<ExportDataKeyResponse> exportDataKey(ExportDataKeyRequest request);

    /**
      * We recommend that you perform the following steps to import your data key to a cryptographic module:
      * *   Call the GenerateAndExportDataKey operation to generate a data key and obtain both the ciphertext of the data key encrypted by using the CMK and that encrypted by using the public key.
      * *   Store the ciphertext of the data key encrypted by using the CMK in KMS Secrets Manager or in a storage service such as ApsaraDB. This ciphertext is used for backup and restoration.
      * *   Import the ciphertext of the data key encrypted by using the public key to the cryptographic module where the private key is stored. Then, you can use the data key to encrypt or decrypt data.
      * >  The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the data keys randomly generated by calling this operation. You must take note of the data keys and the returned ciphertext.
      *
     */
    CompletableFuture<GenerateAndExportDataKeyResponse> generateAndExportDataKey(GenerateAndExportDataKeyRequest request);

    /**
      * This operation creates a random data key, encrypts the data key by using the specified customer master key (CMK), and returns the plaintext and ciphertext of the data key. You can use the plaintext of the data key to locally encrypt your data without using KMS and store the encrypted data together with the ciphertext of the data key. You can obtain the plaintext of the data key from the Plaintext parameter in the response and the ciphertext of the data key from the CiphertextBlob parameter in the response.
      * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key. Therefore, you need to store the ciphertext of the data key in persistent storage.
      * We recommend that you locally encrypt data by performing the following steps:
      * 1\\. Call the GenerateDataKey operation.
      * 2\\. Use the plaintext of the data key that you obtain to locally encrypt data without using KMS. Then, delete the plaintext of the data key from the memory.
      * 3\\. Store the encrypted data together with the ciphertext of the data key that you obtain.
      * We recommend that you locally decrypt data by performing the following steps:
      * *   Call the [Decrypt](~~28950~~) operation to decrypt the locally stored ciphertext of the data key. The plaintext of data key is then returned.
      * *   Use the plaintext of the data key to locally decrypt data and then delete the plaintext of the data key from the memory.
      * In this example, a random data key is generated for the CMK whose ID is `7906979c-8e06-46a2-be2d-68e3ccbc****`.
      *
     */
    CompletableFuture<GenerateDataKeyResponse> generateDataKey(GenerateDataKeyRequest request);

    /**
      * This operation creates a random data key, encrypts the data key by using a specific symmetric CMK, and returns the ciphertext of the data key. This operation serves the same purpose as the [GenerateDataKey](~~28948~~) operation. The only difference is that this operation does not return the plaintext of the data key.
      * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key.
      * > * This operation applies to the scenario when you do not need to use the data key to immediately encrypt data. Before you can use the data key to encrypt data, you must call the [Decrypt](~~28950~~) operation to decrypt the ciphertext of the data key.
      * > * This operation is also suitable for a distributed system with different trust levels. For example, a system stores data in different partitions based on a preset trust policy. A module creates different partitions and generates different data keys for each partition in advance. This module is not involved in data production and consumption after it completes initialization of the control plane. This module is the key provider. When producing and consuming data, modules on the control plane obtain the ciphertext of the data key for a partition first. After decrypting the ciphertext of the data key, modules on the control plane use the plaintext of the data key to encrypt or decrypt data and then clear the plaintext of the data key from the memory. In such a system, the key provider does not need to obtain the plaintext of the data key. It only needs to have the permissions to call the GenerateDataKeyWithoutPlaintext operation. The data producers or consumers do not need to generate new data keys. They only need to have the permissions to call the Decrypt operation.
      *
     */
    CompletableFuture<GenerateDataKeyWithoutPlaintextResponse> generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest request);

    /**
      * In this example, the certificate whose ID is `9a28de48-8d8b-484d-a766-dec4****` is queried. The certificate, certificate chain, certificate ID, and certificate signing request (CSR) are returned.
      *
     */
    CompletableFuture<GetCertificateResponse> getCertificate(GetCertificateRequest request);

    /**
      * The returned parameters can be used to call the [ImportKeyMaterial](https://www.alibabacloud.com/help/en/key-management-service/latest/importkeymaterial) operation.
      * - You can import key material only for CMKs whose Origin parameter is set to EXTERNAL.
      * - The public key and token that are returned by the GetParametersForImport operation must be used together. The public key and token can be used to import key material only for the CMK that is specified when you call the operation.
      * - The public key and token that are returned vary each time you call the GetParametersForImport operation.
      * - You must specify the type of the public key and the encryption algorithm that are used to encrypt key material. The following table lists the types of public keys and the encryption algorithms allowed for each type.   
      * | Public key type | Encryption algorithm | Description |
      * | --------------- | -------------------- | ----------- |
      * | RSA_2048 | RSAES_PKCS1_V1_5 
      * RSAES_OAEP_SHA_1 
      * RSAES_OAEP_SHA_256 | CMKs of all regions and all protection levels are supported. 
      * Dedicated Key Management Service (KMS) does not support RSAES_OAEP_SHA_1. |
      * | EC_SM2 | SM2PKE | CMKs whose ProtectionLevel is set to HSM are supported. The SM2 algorithm is developed and approved by the State Cryptography Administration of China. The SM2 algorithm can be used only to import key material for a CMK whose ProtectionLevel is set to HSM. You can use the SM2 algorithm only when you enable the Managed HSM feature for KMS in the Chinese mainland. For more information, see [Overview of Managed HSM](https://www.alibabacloud.com/help/en/key-management-service/latest/managed-hsm-overview). |
      * For more information, see [Import key material](https://www.alibabacloud.com/help/en/key-management-service/latest/import-key-material). This topic provides an example on how to query the parameters that are used to import key material for a CMK. The ID of the CMK is `1234abcd-12ab-34cd-56ef-12345678****`, the encryption algorithm is `RSAES_PKCS1_V1_5`, and the public key is of the `RSA_2048` type. The parameters that are returned include the ID of the CMK, the public key that is used to encrypt the key material, the token that is used to import the key material, and the time when the token expires.
      *
     */
    CompletableFuture<GetParametersForImportResponse> getParametersForImport(GetParametersForImportRequest request);

    CompletableFuture<GetPublicKeyResponse> getPublicKey(GetPublicKeyRequest request);

    CompletableFuture<GetRandomPasswordResponse> getRandomPassword(GetRandomPasswordRequest request);

    /**
      * If you do not specify a version number or stage label, Secrets Manager returns the secret value of the version marked with ACSCurrent.
      * If a customer master key (CMK) is specified to encrypt the secret value, you must also have the `kms:Decrypt` permission on the CMK to call the GetSecretValue operation.
      * In this example, the value of the secret named `secret001` is obtained. The secret value is returned in the `SecretData` parameter. The secret value is `testdata1`.
      *
     */
    CompletableFuture<GetSecretValueResponse> getSecretValue(GetSecretValueRequest request);

    /**
      * Call [CreateKey](~~28947~~) when creating a CMK, you can select its key material source as external. **Origin** set to **EXTERNAL**. This API is used to import the key material into the CMK.
      * *   To view the CMK **Origin**, see [DescribeKey](~~28952~~).
      * *   Before importing key material, you need to call the [GetParametersForImport](~~68621~~) obtain the parameters required to import the key material, including the public key and import token.
      * > *   The key type of the pair is **Aliyun\\_AES\\_256** the key material must be 256 bits. The key type must be **Aliyun\\_SM4** the CMK and key material must be 128 bits.
      * > *   You can set the expiration time for the key material, or you can set it to never expire.
      * > *   You can reimport the key material and reset the expiration time for the specified CMK at any time, but the same key material must be imported.
      * > *   After the imported key material expires or is deleted, the specified CMK is unavailable until the same key material are imported again.
      * > *   A Key material can be imported to multiple cmks, but any Data or Data Key encrypted by one CMK cannot be decrypted by another CMK.
      *
     */
    CompletableFuture<ImportKeyMaterialResponse> importKeyMaterial(ImportKeyMaterialRequest request);

    CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request);

    CompletableFuture<ListAliasesByKeyIdResponse> listAliasesByKeyId(ListAliasesByKeyIdRequest request);

    CompletableFuture<ListKeyVersionsResponse> listKeyVersions(ListKeyVersionsRequest request);

    CompletableFuture<ListKeysResponse> listKeys(ListKeysRequest request);

    /**
      * Request format: KeyId="string"
      *
     */
    CompletableFuture<ListResourceTagsResponse> listResourceTags(ListResourceTagsRequest request);

    /**
      * The secret value is not included in the returned version information. By default, deprecated secret versions are not returned.
      *
     */
    CompletableFuture<ListSecretVersionIdsResponse> listSecretVersionIds(ListSecretVersionIdsRequest request);

    /**
      * Specifies whether to return the resource tags of the secret. Valid values:
      * *   true: returns the resource tags.
      * *   false: does not return the resource tags. This is the default value.
      *
     */
    CompletableFuture<ListSecretsResponse> listSecrets(ListSecretsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * When you call this operation, note that:
      * - KMS is a paid service. For more information about the billing method, see [Billing description](https://www.alibabacloud.com/help/en/key-management-service/latest/billing-billing).
      * - An Alibaba Cloud account can activate KMS only once.
      * - Make sure that your Alibaba Cloud account has passed real-name authentication.
      *
     */
    CompletableFuture<OpenKmsServiceResponse> openKmsService(OpenKmsServiceRequest request);

    /**
      * This operation is used to store the secret values of new versions. It cannot be used to modify the secret value of an existing version.
      * By default, the newly stored secret value is marked with ACSCurrent, and the mark for the previous version of the secret value is changed from ACSCurrent to ACSPrevious. If you specify the VersionStage parameter, the newly stored secret value is marked with the stage label that you specify.
      * You must specify a version number when you call the operation. Secrets Manager performs operations based on the following rules:
      * *   If the specified version number does not exist in the secret, Secrets Manager creates the version and stores the secret value.
      * *   If the specified version number already exists in the secret and the secret value of the existing version is the same as the secret value that you specify, Secrets Manager ignores the request and returns a success message. The request is idempotent.
      * *   If the specified version number already exists in the secret but the secret value of the existing version is different from the secret value that you specify, Secrets Manager rejects the request and returns a failure message.
      * Limits: This operation is available only for standard secrets.
      * In this example, the secret value of a new version is stored into the `secret001` secret. The `VersionId` parameter is set to `00000000000000000000000000000000203` as the new version, and the `SecretData` parameter is set to `importantdata`.
      *
     */
    CompletableFuture<PutSecretValueResponse> putSecretValue(PutSecretValueRequest request);

    /**
      * You can call this operation in the following scenarios:
      * *   After the CMK that was used to encrypt your data is rotated, you can call this operation to use the latest CMK version to re-encrypt the data. For more information about automatic key rotation, see [Configure automatic key rotation](~~134270~~).
      * *   The CMK that was used to encrypt your data remains unchanged, but EncryptionContext is changed. In this scenario, you can call this operation to re-encrypt the data.
      * *   You can call this operation to use a CMK in KMS to re-encrypt data or a data key that was previously encrypted by a different CMK.
      * To use the ReEncrypt operation, you must have two permissions:
      * *   kms:ReEncryptFrom on the source CMK
      * *   kms:ReEncryptTo on the destination CMK
      * *   For simplicity, you can specify kms:ReEncrypt\\* to allow both of the preceding permissions.
      *
     */
    CompletableFuture<ReEncryptResponse> reEncrypt(ReEncryptRequest request);

    /**
      * You can only use this operation to restore a deleted secret that is within its recovery period. If you set **ForceDeleteWithoutRecovery** to **true** when you delete the secret, you cannot restore it.
      *
     */
    CompletableFuture<RestoreSecretResponse> restoreSecret(RestoreSecretRequest request);

    /**
      * Limits:
      * • A secret of each Alibaba Cloud account can be rotated for a maximum of 50 times per hour.
      * • The RotateSecret operation is unavailable for standard secrets.
      * In this example, the `RdsSecret/Mysql5.4/MyCred` secret is manually rotated, and the version number of the secret is set to `000000123` after the secret is rotated.
      *
     */
    CompletableFuture<RotateSecretResponse> rotateSecret(RotateSecretRequest request);

    /**
      * During the scheduled period, the CMK is in the PendingDeletion state and cannot be used to encrypt data, decrypt data, or generate data keys.
      * After a CMK is deleted, it cannot be recovered. Data that is encrypted and data keys that are generated by using the CMK cannot be decrypted. To prevent accidental deletion of CMKs, Key Management Service (KMS) allows you to only schedule key deletion tasks. You cannot directly delete CMKs. If you want to delete a CMK, call the [DisableKey](~~35151~~) operation to disable the CMK.
      * When you call this operation, you must specify a scheduled period between 7 days to 366 days. The scheduled period starts from the time when you submit the request. You can call the [CancelKeyDeletion](~~44197~~) operation to cancel the key deletion task before the scheduled period ends.
      *
     */
    CompletableFuture<ScheduleKeyDeletionResponse> scheduleKeyDeletion(ScheduleKeyDeletionRequest request);

    /**
      * *   After you enable deletion protection for a CMK, you cannot delete the CMK. If you want to delete the CMK, you must first disable deletion protection for the CMK.
      * *   Before you can call the SetDeletionProtection operation, make sure that the required CMK is not in the Pending Deletion state. You can call the [DescribeKey](~~28952~~) operation to query the CMK status, which is specified by the KeyState parameter.
      * You can enable deletion protection for the CMK whose Alibaba Cloud Resource Name (ARN) is `acs:kms:cn-hangzhou:123213123****:key/0225f411-b21d-46d1-be5b-93931c82****` by using parameter settings provided in this topic. The CMK ARN is specified by the ProtectedResourceArn parameter.
      *
     */
    CompletableFuture<SetDeletionProtectionResponse> setDeletionProtection(SetDeletionProtectionRequest request);

    /**
      * You can add up to 10 tags to a CMK, secret, or certificate.
      * In this example, the tags `[{"TagKey":"S1key1","TagValue":"S1val1"},{"TagKey":"S1key2","TagValue":"S2val2"}]` are added to the CMK whose ID is `08c33a6f-4e0a-4a1b-a3fa-7ddf****`.
      *
     */
    CompletableFuture<TagResourceResponse> tagResource(TagResourceRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * One or more tag keys. Separate multiple tag keys with commas (,).
      * You need to specify only the tag keys, not the tag values.
      * Each tag key must be 1 to 128 bytes in length.
      *
     */
    CompletableFuture<UntagResourceResponse> untagResource(UntagResourceRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request);

    /**
      * In this example, the status of the certificate whose ID is `9a28de48-8d8b-484d-a766-dec4****` is updated to INACTIVE.
      *
     */
    CompletableFuture<UpdateCertificateStatusResponse> updateCertificateStatus(UpdateCertificateStatusRequest request);

    /**
      * This operation replaces the description of a customer master key (CMK) with the description that you specify. The original description of the CMK is specified by the Description parameter when you call the [DescribeKey](~~28952~~) operation. You can call this operation to add, modify, or delete the description of a CMK.
      *
     */
    CompletableFuture<UpdateKeyDescriptionResponse> updateKeyDescription(UpdateKeyDescriptionRequest request);

    /**
      * When automatic key rotation is enabled, KMS automatically creates a key version after the preset rotation period arrives. In addition, KMS sets the new key version as the primary key version.
      * An automatic key rotation policy cannot be configured for the following keys:
      * *   Asymmetric key
      * *   Service-managed key
      * *   Bring your own key (BYOK) that is imported into KMS
      * *   Key that is not in the **Enabled** state
      * In this example, automatic key rotation is enabled for a CMK whose ID is `1234abcd-12ab-34cd-56ef-12345678****`. The automatic rotation period is 30 days.
      *
     */
    CompletableFuture<UpdateRotationPolicyResponse> updateRotationPolicy(UpdateRotationPolicyRequest request);

    /**
      * In this example, the metadata of the `secret001` secret is updated. The `Description` parameter is set to `datainfo`.
      *
     */
    CompletableFuture<UpdateSecretResponse> updateSecret(UpdateSecretRequest request);

    /**
      * After automatic rotation is enabled, Secrets Manager schedules the first automatic rotation by adding the preset rotation interval to the timestamp of the last rotation.
      * Limits: The UpdateSecretRotationPolicy operation cannot be used to update the rotation policy of generic secrets.
      * In this example, the rotation policy of the `RdsSecret/Mysql5.4/MyCred` secret is updated. The following settings are modified:
      * *   The `EnableAutomaticRotation` parameter is set to `true`, which indicates that automatic rotation is enabled.
      * *   The `RotationInterval` parameter is set to `30d`, which indicates that the interval for automatic rotation is 30 days.
      *
     */
    CompletableFuture<UpdateSecretRotationPolicyResponse> updateSecretRotationPolicy(UpdateSecretRotationPolicyRequest request);

    /**
      * Updates the stage label that marks a secret version.
      *
     */
    CompletableFuture<UpdateSecretVersionStageResponse> updateSecretVersionStage(UpdateSecretVersionStageRequest request);

    /**
      * In this example, a certificate issued by a CA is imported into Certificates Manager. The ID of the certificate in Certificates Manager is `12345678-1234-1234-1234-12345678****`.
      *
     */
    CompletableFuture<UploadCertificateResponse> uploadCertificate(UploadCertificateRequest request);

}
